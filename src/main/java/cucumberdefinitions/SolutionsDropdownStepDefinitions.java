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

     @When("I click on another navigation item")
     public void iClickOnAnotherNavigationItem() {
         mainPage.clickAnotherNavItem();
     }

     @And("I click on the \"Automotive\" option")
     public void iClickOnTheAutomotiveOption() {
         mainPage.selectOptionFromSolutionsDropdown("Automotive");
     }

     @Then("I should see the following options in the dropdown:")
     public void iShouldSeeTheFollowingOptionsInDropdown(List<String> expectedOptions) {
         List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
         List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
         Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
     }

     @Then("I should be navigated to the Automotive section of the website")
     public void iShouldBeNavigatedToTheAutomotiveSection() {
         Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
     }

     @Then("the \"Solutions\" dropdown should close")
     public void theSolutionsDropdownShouldClose() {
         Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
     }
}