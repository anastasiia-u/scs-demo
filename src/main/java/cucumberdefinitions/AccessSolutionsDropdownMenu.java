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

    // Scenario: Display all options in the Solutions dropdown
    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainNavigationBar.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        mainNavigationBar.clickDropdownMenu(dropdownName);
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option1));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option2));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option3));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option4));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option5));
    }

    // Scenario: Navigate to Automotive section
    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        mainNavigationBar.selectOption(option);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertTrue(mainNavigationBar.isSectionDisplayed(section));
    }

    // Scenario: Dropdown closes when clicking outside
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        mainNavigationBar.openDropdownMenu(dropdownName);
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainNavigationBar.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainNavigationBar.isDropdownOpen());
    }

    // Scenario: Dropdown closes when another navigation item is clicked
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainNavigationBar.clickAnotherNavigationItem();
    }
}