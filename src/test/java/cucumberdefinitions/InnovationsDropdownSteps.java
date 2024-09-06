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

    @When("I click on the {string} dropdown menu")
    public void iClickOnTheDropdownMenu(String menuName) {
        mainPage.clickInnovationsDropdown();
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void iShouldSeeTheOptions(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.areOptionsVisible(option1, option2, option3, option4, option5));
    }

    @And("I have clicked on the {string} dropdown menu")
    public void iHaveClickedOnTheDropdownMenu(String menuName) throws NoSuchMethodException {
        // This step is identical to 'I click on the "Innovations" dropdown menu', so directly reuse the implementation.
        iClickOnTheDropdownMenu(menuName);
    }

    @When("I click on the {string} option")
    public void iClickOnTheOption(String optionName) {
        mainPage.clickOnOptionInDropdown(optionName);
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection());
    }

    @When("I click outside of the dropdown menu")
    public void iClickOutsideOfTheDropdownMenu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the {string} dropdown menu should close")
    public void theDropdownMenuShouldClose(String menuName) {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen(menuName));
    }
}