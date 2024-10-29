package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.NavigationBarPage;

public class AccessSolutionsDropdownMenu {
    NavigationBarPage navigationBarPage;

    public AccessSolutionsDropdownMenu() {
        navigationBarPage = new NavigationBarPage();
    }

    // Scenario: Dropdown appears with all necessary options
    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        navigationBarPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        navigationBarPage.clickDropdownMenu(dropdownName);
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option1));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option2));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option3));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option4));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option5));
    }

    // Scenario: Each dropdown option is clickable and navigates correctly
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        navigationBarPage.openDropdownMenu(dropdownName);
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        navigationBarPage.clickOption(optionName);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertTrue(navigationBarPage.isInSection(sectionName));
    }

    // Scenario: Dropdown closes when interacting outside
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        navigationBarPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(navigationBarPage.isDropdownOpen());
    }

    // Scenario: Dropdown does not appear when not clicked
    @When("I do not click on the {string} dropdown menu")
    public void i_do_not_click_on_the_dropdown_menu(String dropdownName) {
        // Intentionally left blank to simulate no action
    }

    @Then("the dropdown menu should not appear")
    public void the_dropdown_menu_should_not_appear() {
        Assertions.assertFalse(navigationBarPage.isDropdownVisible());
    }
}