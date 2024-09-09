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

    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @Given("the \"Solutions\" dropdown menu is visible")
    public void theSolutionsDropdownMenuIsVisible() {
        // Assuming the visibility check is implemented in the method
        Assertions.assertTrue(mainPage.isSolutionsDropdownVisible(), "The 'Solutions' dropdown should be visible.");
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void iClickOnTheSolutionsDropdownMenu() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click outside of the \"Solutions\" dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another item in the navigation bar")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickAnotherNavItem();
    }

    @When("I hover over the \"Solutions\" dropdown menu")
    public void iHoverOverTheSolutionsDropdownMenu() {
        mainPage.hoverOverSolutionsDropdown();
    }

    @Then("the dropdown should display options \"Automotive,\" \"Lifestyle,\" \"Consumer,\" \"Professional,\" and \"Digital Transformation Solutions\"")
    public void theDropdownShouldDisplayOptions(List<String> expectedOptions) {
        List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
    }

    @Then("I should be navigated to the \"Automotive\" section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void theSolutionsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("the dropdown should not display its options")
    public void theDropdownShouldNotDisplayItsOptions() {
        Assertions.assertFalse(mainPage.areSolutionsDropdownOptionsVisible(), "Solutions dropdown options should not be visible on hover.");
    }
}