import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;

public class InnovationsDropdownStepDefinitions {
    MainPage mainPage;

    public InnovationsDropdownStepDefinitions() {
        mainPage = new MainPage();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @Given("I have opened the \"Innovations\" dropdown menu")
    public void iHaveOpenedTheInnovationsDropdown() {
        mainPage.clickInnovationsDropdown();
    }

    @When("I click on the \"Innovations\" dropdown menu")
    public void iClickOnTheInnovationsDropdownMenu() {
        mainPage.clickInnovationsDropdown();
    }

    @When("I click outside the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another navigation item")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickAnotherNavItem();
    }

    @And("I click on the \"[specific option]\" option")
    public void iClickOnASpecificOption(String option) {
        mainPage.selectOptionFromInnovationsDropdown(option);
    }

    @Then("I should see the following options in the dropdown:")
    public void iShouldSeeTheFollowingOptionsInDropdown(List<String> expectedOptions) {
        List<WebElement> optionsElements = mainPage.getInnovationsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Innovations dropdown.");
    }

    @Then("I should be navigated to the [specific section] of the website")
    public void iShouldBeNavigatedToASpecificSection(String section) {
        Assertions.assertTrue(mainPage.isOnSpecificSection(section), "User should be navigated to the " + section + " section.");
    }

    @Then("the \"Innovations\" dropdown should close")
    public void theInnovationsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isInnovationsDropdownOpen(), "Innovations dropdown should be closed.");
    }
}