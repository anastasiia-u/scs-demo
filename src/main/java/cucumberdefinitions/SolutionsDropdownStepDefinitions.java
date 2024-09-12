package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;

public class SolutionsDropdownStepDefinitions {
    MainPage mainPage;

    public SolutionsDropdownStepDefinitions() {
        mainPage = new MainPage();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @Given("I have opened the \"Solutions\" dropdown menu")
    public void iHaveOpenedTheSolutionsDropdown() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void iClickOnTheSolutionsDropdownMenu() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click anywhere outside the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on any other navigation item on the bar")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickAnotherNavItem();
    }

    @Then("I should see the dropdown options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldSeeTheFollowingOptionsInDropdown(List<String> expectedOptions) {
        List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
    }

    @And("When I click on each of the dropdown options")
    public void iClickOnEachOfTheDropdownOptions() {
        List<String> options = Arrays.asList("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions");
        options.forEach(option -> {
            mainPage.selectOptionFromSolutionsDropdown(option);
            Assertions.assertTrue(mainPage.isOnSection(option), "User should be navigated to the " + option + " section.");
            mainPage.navigateToHomePage(); // Assuming there's a method to navigate back to the homepage between selections
        });
    }

    @And("I try to select a non-existent option \"Space Exploration\"")
    public void iTryToSelectANonExistentOption() {
        Assertions.assertFalse(mainPage.selectOptionFromSolutionsDropdown("Space Exploration"), "Selecting a non-existent option should not be possible.");
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void theSolutionsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("I should not be navigated away from the homepage")
    public void iShouldNotBeNavigatedAwayFromTheHomepage() {
        Assertions.assertTrue(mainPage.isOnHomepage(), "User should remain on the homepage after attempting to select a non-existent option.");
    }

    @And("I should see an error message or no action should be taken")
    public void iShouldSeeAnErrorMessageOrNoActionShouldBeTaken() {
        Assertions.assertTrue(mainPage.isErrorDisplayed() || mainPage.isOnHomepage(), "An error message should be displayed or no action should be taken.");
    }

}