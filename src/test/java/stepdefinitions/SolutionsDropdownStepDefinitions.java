import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
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
         iClickOnTheSolutionsDropdownMenu();
     }

     @Given("the \"Solutions\" dropdown menu is open")
     public void theSolutionsDropdownMenuIsOpen() {
         if (!mainPage.isSolutionsDropdownOpen()) {
             mainPage.clickSolutionsDropdown();
         }
     }

     @Given("the \"Solutions\" dropdown menu is not visible")
     public void theSolutionsDropdownMenuIsNotVisible() {
         Assertions.assertFalse(mainPage.isSolutionsDropdownVisible(), "Solutions dropdown menu should not be visible.");
     }

     @When("I click on the \"Solutions\" dropdown menu")
     public void iClickOnTheSolutionsDropdownMenu() {
         mainPage.clickSolutionsDropdown();
     }

     @When("I click outside of the \"Solutions\" dropdown menu")
     public void iClickOutsideTheSolutionsDropdownMenu() {
         mainPage.clickOutsideDropdown();
     }

     @When("I select any option within the \"Solutions\" dropdown")
     public void iSelectAnyOptionWithinTheSolutionsDropdown() {
         // Assuming there's a method to select a random option for demonstration
         mainPage.selectRandomOptionFromSolutionsDropdown();
     }

     @When("I try to click on the \"Solutions\" dropdown menu")
     public void iTryToClickOnTheSolutionsDropdownMenu() {
         // This simulates the attempt without actual clicking since it's not visible
         Assertions.assertFalse(mainPage.isSolutionsDropdownClickable(), "Solutions dropdown menu should not be clickable.");
     }

     @Then("I should see the dropdown options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
     public void iShouldSeeTheDropdownOptions(List<String> expectedOptions) {
         List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
         List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
         Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
     }

     @Then("I should be redirected to the Automotive section of the website")
     public void iShouldBeRedirectedToTheAutomotiveSectionOfTheWebsite() {
         Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
     }

     @Then("the \"Solutions\" dropdown menu should close")
     public void theSolutionsDropdownMenuShouldClose() {
         Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
     }

     @Then("I should not see any dropdown options")
     public void iShouldNotSeeAnyDropdownOptions() {
         Assertions.assertTrue(mainPage.getSolutionsDropdownOptions().isEmpty(), "No dropdown options should be visible.");
     }
}