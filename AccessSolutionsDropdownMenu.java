package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;
import pageobjects.MainNavigationBar;

public class AccessSolutionsDropdownMenu {
    MainNavigationBar mainNavigationBar;

    public AccessSolutionsDropdownMenu() {
        mainNavigationBar = new MainNavigationBar();
    }

    // Scenario: Dropdown Visibility
    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        // Ensure the main navigation bar is loaded
        Assertions.assertTrue(mainNavigationBar.isNavigationBarVisible(), "Main navigation bar is not visible.");
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenu) {
        // Click on the specified dropdown menu
        mainNavigationBar.clickDropdownMenu(dropdownMenu);
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        // Verify the dropdown menu contains the expected options
        Assertions.assertTrue(mainNavigationBar.isDropdownOptionVisible(option1), option1 + " is not visible.");
        Assertions.assertTrue(mainNavigationBar.isDropdownOptionVisible(option2), option2 + " is not visible.");
        Assertions.assertTrue(mainNavigationBar.isDropdownOptionVisible(option3), option3 + " is not visible.");
        Assertions.assertTrue(mainNavigationBar.isDropdownOptionVisible(option4), option4 + " is not visible.");
        Assertions.assertTrue(mainNavigationBar.isDropdownOptionVisible(option5), option5 + " is not visible.");
    }

    // Scenario: Option Navigation
    @Given("the {string} dropdown menu is visible")
    public void the_dropdown_menu_is_visible(String dropdownMenu) {
        // Ensure the dropdown menu is visible
        Assertions.assertTrue(mainNavigationBar.isDropdownMenuVisible(dropdownMenu), dropdownMenu + " dropdown menu is not visible.");
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        // Click on the specified option in the dropdown menu
        mainNavigationBar.clickDropdownOption(option);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String section) {
        // Verify the user is navigated to the correct section
        Assertions.assertTrue(mainNavigationBar.isUserOnSection(section), "User is not on the " + section + " section.");
    }

    // Scenario: Dropdown Dismissal by clicking outside
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        // Simulate clicking outside the dropdown menu
        mainNavigationBar.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        // Verify the dropdown menu is closed
        Assertions.assertFalse(mainNavigationBar.isAnyDropdownMenuVisible(), "Dropdown menu is still visible.");
    }

    // Scenario: Dropdown Dismissal by interacting with other navigation items
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        // Simulate clicking on another navigation item
        mainNavigationBar.clickAnotherNavigationItem();
    }

    // Scenario: Invalid Option Selection
    @When("I attempt to click on a non-existent option {string}")
    public void i_attempt_to_click_on_a_non_existent_option(String invalidOption) {
        // Attempt to click on a non-existent option
        mainNavigationBar.clickDropdownOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        // Verify the user is not navigated to any section
        Assertions.assertFalse(mainNavigationBar.isUserNavigatedToAnySection(), "User was navigated to a section unexpectedly.");
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        // Verify the error message is displayed
        Assertions.assertEquals(errorMessage, mainNavigationBar.getErrorMessage(), "Error message does not match.");
    }
}
