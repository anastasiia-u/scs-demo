package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.NewsHomePage;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownFunctionalitySteps {
    NewsHomePage newsHomePage;

    public DropdownFunctionalitySteps() {
        newsHomePage = new NewsHomePage();
    }

    @Given("I am on the homepage with the main navigation bar")
    public void i_am_on_the_homepage_with_the_main_navigation_bar() {
        newsHomePage.open();
    }

    @When("I click on the {string} navigation item")
    public void i_click_on_the_navigation_item(String navigationItem) {
        switch (navigationItem.toLowerCase()) {
            case "about us":
                newsHomePage.getAboutUsNavItem().click();
                break;
            case "careers":
                newsHomePage.getCareersNavItem().click();
                break;
            case "investors":
                newsHomePage.getInvestorsNavItem().click();
                break;
            case "partner with us":
                newsHomePage.getPartnerNavItem().click();
                break;
            case "media":
                newsHomePage.getMediaNavItem().click();
                break;
            default:
                Assertions.fail("Invalid navigation item: " + navigationItem);
        }
    }

    @Then("the dropdown for {string} should be displayed")
    public void the_dropdown_for_should_be_displayed(String navigationItem) {
        WebElement dropdownElement;
        switch (navigationItem.toLowerCase()) {
            case "about us":
                dropdownElement = newsHomePage.getAboutSciDropdown();
                break;
            case "careers":
                // dropdownElement = newsHomePage.getCareersDropdown();
                break;
            case "investors":
                // dropdownElement = newsHomePage.getInvestorsDropdown();
                break;
            case "partner with us":
                // dropdownElement = newsHomePage.getPartnerDropdown();
                break;
            case "media":
                // dropdownElement = newsHomePage.getMediaDropdown();
                break;
            default:
                dropdownElement = null;
                break;
        }
        Assertions.assertNotNull(dropdownElement, "Dropdown element is null for: " + navigationItem);
        Assertions.assertTrue(dropdownElement.isDisplayed(), "Dropdown for " + navigationItem + " is not displayed");
    }

    @And("the dropdown should include the following options:")
    public void the_dropdown_should_include_the_following_options(List<String> options) {
        List<WebElement> actualOptions = newsHomePage.getDropdownOptions();
        List<String> actualOptionsText = actualOptions.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(actualOptionsText.containsAll(options), "Not all expected options are present in the dropdown");
    }

    @Given("the {string} dropdown is displayed")
    public void the_dropdown_is_displayed(String navigationItem) {
        boolean isDropdownDisplayed = newsHomePage.isDropdownDisplayed(navigationItem);
        Assertions.assertTrue(isDropdownDisplayed, navigationItem + " dropdown is not displayed");
    }

    @When("I click on the {string} in the dropdown")
    public void i_click_on_the_in_the_dropdown(String option) {
        newsHomePage.clickDropdownOption(option);
    }

    @Then("I should be taken to the {string} page")
    public void i_should_be_taken_to_the_page(String expectedPage) {
        String currentUrl = newsHomePage.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains(expectedPage), "Current page URL does not contain: " + expectedPage);
    }

    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String navigationItem) {
        boolean isDropdownClosed = newsHomePage.isDropdownClosed(navigationItem);
        Assertions.assertTrue(isDropdownClosed, navigationItem + " dropdown did not close");
    }
}
