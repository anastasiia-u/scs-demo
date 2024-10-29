package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.NavigationBarPage;

public class AccessSolutionsDropdown {
    NavigationBarPage navigationBarPage;

    public AccessSolutionsDropdown() {
        navigationBarPage = new NavigationBarPage();
    }

    // Scenario: Dropdown Visibility
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

    // Scenario: Option Navigation
    @Given("the {string} dropdown is visible")
    public void the_dropdown_is_visible(String dropdownName) {
        navigationBarPage.clickDropdownMenu(dropdownName);
        Assertions.assertTrue(navigationBarPage.isDropdownVisible(dropdownName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        navigationBarPage.clickOption(optionName);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertTrue(navigationBarPage.isSectionVisible(sectionName));
    }

    // Scenario: Dropdown Dismissal
    @When("I click outside the dropdown")
    public void i_click_outside_the_dropdown() {
        navigationBarPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(navigationBarPage.isDropdownVisible("Solutions"));
    }

    // Negative Scenario: Dropdown Not Visible
    @When("I do not click on the {string} dropdown menu")
    public void i_do_not_click_on_the_dropdown_menu(String dropdownName) {
        // Intentionally left blank to simulate no action
    }

    @Then("the dropdown should not be visible")
    public void the_dropdown_should_not_be_visible() {
        Assertions.assertFalse(navigationBarPage.isDropdownVisible("Solutions"));
    }
}