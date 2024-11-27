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
        Assertions.assertTrue(navigationBarPage.isDropdownVisible(dropdownName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        navigationBarPage.clickOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(navigationBarPage.isSectionDisplayed(sectionName));
    }

    // Scenario: Dropdown Dismissal by clicking outside
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        navigationBarPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(navigationBarPage.isDropdownVisible("Solutions"));
    }

    // Scenario: Dropdown Dismissal by interacting with other navigation items
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        navigationBarPage.clickAnotherNavigationItem();
    }

    // Scenario: Invalid Option Selection
    @When("I attempt to click on a non-existent option {string}")
    public void i_attempt_to_click_on_a_non_existent_option(String invalidOption) {
        navigationBarPage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated away from the current page")
    public void i_should_not_be_navigated_away_from_the_current_page() {
        Assertions.assertTrue(navigationBarPage.isCurrentPageIntact());
    }
}
