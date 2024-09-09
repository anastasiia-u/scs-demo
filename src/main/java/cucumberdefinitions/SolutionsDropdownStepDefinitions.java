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
     MainPage mainPage = new MainPage();

     @Given("I am on the homepage")
     public void iAmOnTheHomepage() {
         mainPage.openHomePage();
     }

     @Given("I have clicked on the \"Solutions\" dropdown menu")
     public void iHaveClickedOnTheSolutionsDropdownMenu() {
         mainPage.clickSolutionsDropdown();
     }

     @Given("I am on the homepage and the \"Solutions\" dropdown menu is open")
     public void iAmOnTheHomepageAndTheSolutionsDropdownIsOpen() {
         mainPage.openHomePage();
         mainPage.clickSolutionsDropdown();
     }

     @When("I click on the \"Solutions\" dropdown menu")
     public void iClickOnTheSolutionsDropdownMenu() {
         mainPage.clickSolutionsDropdown();
     }

     @When("I click outside the \"Solutions\" dropdown area")
     public void iClickOutsideTheSolutionsDropdownArea() {
         mainPage.clickOutsideDropdown();
     }

     @When("I select any option from the \"Solutions\" dropdown")
     public void iSelectAnyOptionFromTheSolutionsDropdown() {
         mainPage.selectAnyOptionFromSolutionsDropdown();
     }

     @And("I click on the \"Automotive\" option")
     public void iClickOnTheAutomotiveOption() {
         mainPage.selectOptionFromSolutionsDropdown("Automotive");
     }

     @Then("I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
     public void iShouldSeeSpecificOptionsInDropdown(List<String> expectedOptions) {
         List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
         List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
         Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
     }

     @Then("I should be redirected to the Automotive section of the website")
     public void iShouldBeRedirectedToTheAutomotiveSection() {
         Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
     }

     @Then("the \"Solutions\" dropdown menu should close")
     public void theSolutionsDropdownShouldClose() {
         Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
     }
}