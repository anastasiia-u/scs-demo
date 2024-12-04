package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageobjects.NewsPage;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownFunctionalitySteps {
    NewsPage newsPage;

    public DropdownFunctionalitySteps() {
        newsPage = new NewsPage();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        newsPage.open();
    }

    @When("I click on the {string} in the main navigation bar")
    public void iClickOnTheInMainNavigationBar(String navigationItem) {
        WebElement dropdownElement = getDropdownElement(navigationItem);
        dropdownElement.click();
    }

    @Then("the dropdown for {string} should be visible")
    public void theDropdownForShouldBeVisible(String navigationItem) {
        WebElement dropdownElement = getDropdownElement(navigationItem);
        Assertions.assertTrue(dropdownElement.isDisplayed(), "Dropdown for " + navigationItem + " should be visible.");
    }

    @And("it should contain the following options:")
    public void itShouldContainTheFollowingOptions(List<String> options) {
        List<WebElement> dropdownOptions = newsPage.getDropdownOptions();
        List<String> optionTexts = dropdownOptions.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(options.stream().allMatch(optionTexts::contains), "All options should be present in the dropdown.");
    }

    @Given("I have opened the dropdown for {string}")
    public void iHaveOpenedTheDropdownFor(String navigationItem) {
        iClickOnTheInMainNavigationBar(navigationItem);
        theDropdownForShouldBeVisible(navigationItem);
    }

    @When("I click on the {string} in the dropdown")
    public void iClickOnTheInDropdown(String option) {
        WebElement optionElement = newsPage.getDropdownOption(option);
        optionElement.click();
    }

    @Then("I should be taken to the {string} page")
    public void iShouldBeTakenToThePage(String expectedPage) {
        String currentUrl = newsPage.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains(expectedPage), "Should navigate to " + expectedPage + " page.");
    }

    @When("I click outside the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        newsPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void theDropdownShouldClose() {
        WebElement dropdownElement = newsPage.getOpenDropdown();
        Assertions.assertFalse(dropdownElement.isDisplayed(), "Dropdown should be closed.");
    }

    private WebElement getDropdownElement(String navigationItem) {
        switch (navigationItem) {
            case "About Us":
                return newsPage.getAboutUsDropdown();
            case "Careers":
                return newsPage.getCareersDropdown();
            case "Investors":
                return newsPage.getInvestorsDropdown();
            case "Partner with Us":
                return newsPage.getPartnerWithUsDropdown();
            case "Media":
                return newsPage.getMediaDropdown();
            default:
                throw new IllegalArgumentException("Invalid navigation item: " + navigationItem);
        }
    }
}