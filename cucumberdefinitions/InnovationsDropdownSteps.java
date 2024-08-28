package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pageobjects.MainPage;
import org.junit.jupiter.api.Assertions;

/**
 * Step definitions for validating the Innovations dropdown functionality.
 */
public class InnovationsDropdownSteps {

    MainPage mainPage;

    public InnovationsDropdownSteps() {
        mainPage = new MainPage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.open();
    }

    @When("I click on the "Innovations" dropdown menu")
    public void i_click_on_the_innovations_dropdown_menu() {
        mainPage.getInnovationsDropdown().click();
    }

    @Then("the dropdown should display options {string}")
    public void the_dropdown_should_display_options(String expectedOptions) {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(Arrays.asList(expectedOptions.split(", "))));
    }

    @Given("the "Innovations" dropdown menu is visible")
    public void the_innovations_dropdown_menu_is_visible() {
        Assertions.assertTrue(mainPage.getInnovationsDropdown().isVisible());
    }

    @When("I click on the "Automotive" option")
    public void i_click_on_the_automotive_option() {
        mainPage.clickDropdownOption("Automotive");
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section() {
        Assertions.assertTrue(mainPage.getCurrentUrl().endsWith("/automotive"));
    }

    @When("I click outside the "Innovations" dropdown area")
    public void i_click_outside_the_innovations_dropdown_area() {
        mainPage.clickOutsideDropdownArea();
    }

    @Then("the "Innovations" dropdown should close")
    public void the_innovations_dropdown_should_close() {
        Assertions.assertFalse(mainPage.getInnovationsDropdown().isVisible());
    }
}