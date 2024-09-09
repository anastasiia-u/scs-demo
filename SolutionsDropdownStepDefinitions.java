package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import java.util.List;

public class SolutionsDropdownStepDefinitions {
    MainPage mainPage = new MainPage();

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

    @When("I click outside of the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another item in the navigation bar")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickAnotherNavItem();
    }

    @When("I click on the \"Automotive\" option")
    public void iClickOnTheAutomotiveOption() {
        mainPage.selectOptionFromSolutionsDropdown("Automotive");
    }

    @Then("I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldSeeTheFollowingOptions(List<String> expectedOptions) {
        List<String> actualOptions = mainPage.getSolutionsDropdownOptions();
        Assertions.assertTrue(actualOptions.containsAll(expectedOptions), "All expected options should be present in the Solutions dropdown.");
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
    }

    @Then("the \"Solutions\" dropdown should close")
    public void theSolutionsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("I should not see any missing options from \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldNotSeeAnyMissingOptions() {
        List<String> expectedOptions = Arrays.asList("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions");
        List<String> actualOptions = mainPage.getSolutionsDropdownOptions();
        Assertions.assertTrue(actualOptions.containsAll(expectedOptions) && expectedOptions.containsAll(actualOptions), "There should be no missing options in the Solutions dropdown.");
    }
}
