package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.NavigationBarPage;

public class AccessSolutionsDropdownMenu {
    NavigationBarPage navigationBarPage;

    public AccessSolutionsDropdownMenu() {
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

    @Then("I should see options such as {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option1));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option2));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option3));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option4));
        Assertions.assertTrue(navigationBarPage.isOptionVisible(option5));
    }

    // Scenario: Option Navigation
    @Given("the {string} dropdown menu is visible")
    public void the_dropdown_menu_is_visible(String dropdownName) {
        navigationBarPage.ensureDropdownMenuVisible(dropdownName);
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        navigationBarPage.clickOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(navigationBarPage.isSectionVisible(sectionName));
    }

    // Scenario: Dropdown Dismissal by Clicking Outside
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        navigationBarPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(navigationBarPage.isDropdownMenuVisible());
    }

    // Scenario: Dropdown Dismissal by Navigating to Another Item
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        navigationBarPage.clickAnotherNavigationItem();
    }

    // Scenario: Dropdown Visibility with No Options
    @And("there are no options available")
    public void there_are_no_options_available() {
        navigationBarPage.clearDropdownOptions();
    }

    @Then("I should see a message indicating {string}")
    public void i_should_see_a_message_indicating(String message) {
        Assertions.assertEquals(message, navigationBarPage.getNoOptionsMessage());
    }
}