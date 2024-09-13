package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class SolutionsDropdownSteps {
    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @Given("I have opened the \"Solutions\" dropdown menu")
    public void iHaveOpenedTheSolutionsDropdownMenu() {
        mainPage.openSolutionsDropdown();
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void iClickOnTheSolutionsDropdownMenu() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click outside of the dropdown menu")
    public void iClickOutsideOfTheDropdownMenu() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another navigation item")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickOtherNavigationItem();
    }

    @When("I click on any option")
    public void iClickOnAnyOption() {
        mainPage.clickAnyOptionInSolutions();
    }

    @Then("I should see options \"Automotive, Lifestyle, Consumer, Professional, and Digital Transformation Solutions\"")
    public void iShouldSeeOptions() {
        Assertions.assertTrue(mainPage.areAllOptionsDisplayed());
    }

    @Then("each option should be clickable")
    public void eachOptionShouldBeClickable() {
        Assertions.assertTrue(mainPage.areOptionsClickable());
    }

    @Then("clicking on each option navigates to the correct section")
    public void clickingOnEachOptionNavigatesToTheCorrectSection() {
        Assertions.assertTrue(mainPage.isNavigationCorrect());
    }

    @Then("the dropdown menu should close")
    public void theDropdownMenuShouldClose() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @Then("I should not see any missing options from \"Automotive, Lifestyle, Consumer, Professional, and Digital Transformation Solutions\"")
    public void iShouldNotSeeAnyMissingOptions() {
        Assertions.assertFalse(mainPage.areOptionsMissing());
    }

    @Then("I should not be navigated to a wrong section")
    public void iShouldNotBeNavigatedToAWrongSection() {
        Assertions.assertFalse(mainPage.isNavigationIncorrect());
    }

}
