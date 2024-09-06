package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {
    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.open();
    }

    @Given("I have the {string} dropdown menu open")
    public void i_have_the_dropdown_menu_open(String menuName) {
        mainPage.openDropdownMenu(menuName);
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        mainPage.clickDropdownMenu(menuName);
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        mainPage.clickOutsideDropdownArea();
    }

    @When("I select any option from the dropdown")
    public void i_select_any_option_from_the_dropdown() {
        mainPage.selectAnyDropdownOption();
    }

    @And("I click on {string} from the dropdown options")
    public void i_click_on_from_the_dropdown_options(String optionName) {
        mainPage.selectDropdownOption(optionName);
    }

    @Then("I should see the dropdown options {string}")
    public void i_should_see_the_dropdown_options(String options) {
        Assertions.assertTrue(mainPage.verifyDropdownOptionsVisible(options.split(", ")));
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(mainPage.isSectionVisible(sectionName));
    }

    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String menuName) {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen(menuName));
    }
}
