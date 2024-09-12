package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;

public class SolutionsDropdownStepDefinitions {
    MainPage mainPage;

    public SolutionsDropdownStepDefinitions() {
        mainPage = new MainPage();
    }

    @Given("I am on the main navigation bar")
    public void iAmOnTheMainNavigationBar() {
        mainPage.verifyOnNavigationBar(); // Assuming verifyOnNavigationBar checks if the user is on the main navigation bar
    }

    @When("I click on the \"Solutions\" dropdown")
    public void iClickOnTheSolutionsDropdown() {
        mainPage.clickSolutionsDropdown();
    }

    @Then("I should see the dropdown menu appear with options {string}, {string}, {string}, {string}, and {string}")
    public void iShouldSeeTheDropdownMenuAppearWithOptions(String automotive, String lifestyle, String consumer, String professional, String digitalTransformation) {
        List<String> expectedOptions = List.of(automotive, lifestyle, consumer, professional, digitalTransformation);
        List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
    }

    @Given("I am viewing the \"Solutions\" dropdown menu")
    public void iAmViewingTheSolutionsDropdownMenu() {
        mainPage.verifySolutionsDropdownIsOpen(); // Assuming verifySolutionsDropdownIsOpen checks if the Solutions dropdown is being viewed
    }

    @Given("the \"Solutions\" dropdown menu is open")
    public void theSolutionsDropdownMenuIsOpen() {
        mainPage.verifySolutionsDropdownIsOpen();
    }

    @When("I click on the option \"Automotive\"")
    public void iClickOnTheOptionAutomotive() {
        mainPage.selectOptionFromSolutionsDropdown("Automotive");
    }

    @Then("I should be navigated to the \"Automotive\" section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
    }

    @When("I click outside of the dropdown menu")
    public void iClickOutsideOfTheDropdownMenu() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another item in the main navigation bar")
    public void iClickOnAnotherItemInTheMainNavigationBar() {
        mainPage.clickAnotherNavItem();
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void theSolutionsDropdownMenuShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @When("I do not click on the \"Solutions\" dropdown")
    public void iDoNotClickOnTheSolutionsDropdown() {
        // This step is for a negative scenario where the action is the absence of a click, thus no action is required here.
    }

    @Then("I should not see the dropdown menu")
    public void iShouldNotSeeTheDropdownMenu() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should not be open.");
    }
}
