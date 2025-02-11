package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;
import pageobjects.HomePage;

import java.util.List;

public class AccessSolutionsDropdownMenu {
    HomePage homePage;

    public AccessSolutionsDropdownMenu() {
        homePage = new HomePage();
    }

    // Scenario: Dropdown menu appears with all necessary options
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        // Navigate to the homepage
        homePage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        // Click on the specified dropdown menu
        homePage.getDropdownMenu(dropdownName).click();
    }

    @Then("I should see the following options:")
    public void i_should_see_the_following_options(List<String> expectedOptions) {
        // Verify that the dropdown menu contains the expected options
        List<String> actualOptions = homePage.getDropdownOptions();
        Assertions.assertEquals(expectedOptions, actualOptions, "Dropdown options do not match expected options.");
    }

    // Scenario: Each dropdown option is clickable and navigates correctly
    @And("I select the {string} option")
    public void i_select_the_option(String optionName) {
        // Click on the specified dropdown option
        homePage.selectDropdownOption(optionName);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        // Verify that the user is navigated to the correct section
        String currentUrl = homePage.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains(sectionName.toLowerCase()), "User is not navigated to the correct section.");
    }

    // Scenario: Dropdown closes when interacting outside of it
    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownName) {
        // Open the specified dropdown menu
        homePage.getDropdownMenu(dropdownName).click();
        Assertions.assertTrue(homePage.isDropdownOpen(dropdownName), "Dropdown menu is not open.");
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        // Simulate clicking outside the dropdown menu
        homePage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        // Verify that the dropdown menu is closed
        Assertions.assertFalse(homePage.isDropdownOpen(), "Dropdown menu did not close.");
    }

    // Scenario: Dropdown closes when interacting with other navigation items
    @When("I click on the {string} navigation item")
    public void i_click_on_the_navigation_item(String navigationItem) {
        // Click on the specified navigation item
        homePage.getNavigationItem(navigationItem).click();
    }
}
