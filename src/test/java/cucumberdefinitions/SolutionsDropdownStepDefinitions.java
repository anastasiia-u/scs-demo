package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
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

    @When("I click outside the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on the \"Automotive\" option")
    public void iClickOnTheAutomotiveOption() {
        mainPage.selectOptionFromSolutionsDropdown("Automotive");
    }

    @Then("I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldSeeTheOptionsInDropdown() {
        List<String> expectedOptions = Arrays.asList("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions");
        Assertions.assertTrue(mainPage.getSolutionsDropdownOptions().containsAll(expectedOptions), "All expected options should be present in the Solutions dropdown.");
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void theSolutionsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("I should not see any options if the dropdown is malfunctioning")
    public void iShouldNotSeeAnyOptionsIfDropdownIsMalfunctioning() {
        Assertions.assertTrue(mainPage.getSolutionsDropdownOptions().isEmpty(), "No options should be visible if the dropdown is malfunctioning.");
    }

    @And("An error message \"Failed to load dropdown options\" should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        Assertions.assertTrue(mainPage.isErrorMessageDisplayed("Failed to load dropdown options"), "Error message should be displayed if the dropdown is malfunctioning.");
    }
}