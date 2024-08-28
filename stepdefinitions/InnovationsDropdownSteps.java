package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {

    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @When("I click on the \"Innovations\" dropdown menu")
    public void iClickOnTheInnovationsDropdownMenu() {
        mainPage.getInnovationsDropdown().click();
    }

    @Then("I should see the dropdown options {string}")
    public void iShouldSeeTheDropdownOptions(String options) {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(List.of(options.split(", "))));
    }

    @And("I have clicked on the \"Innovations\" dropdown menu")
    public void iHaveClickedOnTheInnovationsDropdownMenu() {
        mainPage.getInnovationsDropdown().click();
    }

    @When("I click on an option within the dropdown")
    public void iClickOnAnOptionWithinTheDropdown(String option) {
        mainPage.selectDropdownOption(option);
    }

    @Then("I should be navigated to the corresponding section of the website")
    public void iShouldBeNavigatedToTheCorrespondingSectionOfTheWebsite() {
        Assertions.assertTrue(mainPage.isCorrectSectionDisplayed());
    }

    @When("I click outside of the dropdown area")
    public void iClickOutsideOfTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the \"Innovations\" dropdown menu should close")
    public void theInnovationsDropdownMenuShouldClose() {
        Assertions.assertFalse(mainPage.isDropdownDisplayed());
    }

    @When("I click on another item in the navigation bar")
    public void iClickOnAnotherItemInTheNavigationBar() {
        mainPage.clickOtherNavigationItem();
    }
}