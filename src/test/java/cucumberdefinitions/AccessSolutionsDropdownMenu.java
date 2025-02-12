package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class AccessSolutionsDropdownMenu {
    MainPage mainPage;

    public AccessSolutionsDropdownMenu() {
        mainPage = new MainPage();
    }

    // Scenario: Dropdown visibility when clicked
    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        // Open the main page
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        // Click on the specified dropdown menu
        mainPage.getDropdownMenu(dropdownName).click();
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        // Verify that all expected options are visible in the dropdown menu
        Assertions.assertTrue(mainPage.isDropdownOptionVisible(option1), option1 + " is not visible");
        Assertions.assertTrue(mainPage.isDropdownOptionVisible(option2), option2 + " is not visible");
        Assertions.assertTrue(mainPage.isDropdownOptionVisible(option3), option3 + " is not visible");
        Assertions.assertTrue(mainPage.isDropdownOptionVisible(option4), option4 + " is not visible");
        Assertions.assertTrue(mainPage.isDropdownOptionVisible(option5), option5 + " is not visible");
    }

    // Scenario: Navigate to Automotive section
    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        // Select the specified option from the dropdown menu
        mainPage.selectDropdownOption(option);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        // Verify that the user is navigated to the correct section
        Assertions.assertTrue(mainPage.isOnSection(section), "Not navigated to the " + section + " section");
    }

    // Scenario: Dropdown dismissal when clicking outside
    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownName) {
        // Open the specified dropdown menu
        mainPage.getDropdownMenu(dropdownName).click();
        Assertions.assertTrue(mainPage.isDropdownOpen(dropdownName), dropdownName + " dropdown is not open");
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        // Simulate clicking outside the dropdown menu
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        // Verify that the dropdown menu is closed
        Assertions.assertFalse(mainPage.isDropdownOpen(), "Dropdown menu is still open");
    }

    // Scenario: Dropdown dismissal when selecting another navigation item
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        // Click on another navigation item
        mainPage.clickAnotherNavigationItem();
    }
}