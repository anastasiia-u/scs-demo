package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.NavigationBar;

public class ValidateSolutionsDropdownFunctionality {
    NavigationBar navigationBar;

    public ValidateSolutionsDropdownFunctionality() {
        navigationBar = new NavigationBar();
    }

    // Scenario: Dropdown Visibility
    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        navigationBar.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        navigationBar.clickDropdownMenu(dropdownName);
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(navigationBar.isOptionVisible(option1));
        Assertions.assertTrue(navigationBar.isOptionVisible(option2));
        Assertions.assertTrue(navigationBar.isOptionVisible(option3));
        Assertions.assertTrue(navigationBar.isOptionVisible(option4));
        Assertions.assertTrue(navigationBar.isOptionVisible(option5));
    }

    // Scenario: Option Navigation
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        navigationBar.openDropdownMenu(dropdownName);
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        navigationBar.clickOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(navigationBar.isInSection(sectionName));
    }

    // Scenario: Dropdown Dismissal by Clicking Outside
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        navigationBar.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(navigationBar.isDropdownOpen());
    }

    // Scenario: Dropdown Dismissal by Navigating to Another Menu
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        navigationBar.clickAnotherNavigationItem();
    }

    // Scenario: Invalid Option Selection
    @When("I attempt to select an option that does not exist")
    public void i_attempt_to_select_an_option_that_does_not_exist() {
        navigationBar.selectInvalidOption();
    }

    @Then("I should see an error message indicating the option is not available")
    public void i_should_see_an_error_message_indicating_the_option_is_not_available() {
        Assertions.assertTrue(navigationBar.isErrorMessageDisplayed());
    }
}
