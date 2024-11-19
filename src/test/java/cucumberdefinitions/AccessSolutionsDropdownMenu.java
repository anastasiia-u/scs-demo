package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.HomePage;

public class AccessSolutionsDropdownMenu {
    HomePage homePage;

    public AccessSolutionsDropdownMenu() {
        homePage = new HomePage();
    }

    // Scenario: Dropdown visibility when clicked
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        homePage.getDropdownMenu(menuName).click();
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option1));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option2));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option3));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option4));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option5));
    }

    // Scenario: Navigate to Automotive section
    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        homePage.selectDropdownOption(option);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertTrue(homePage.isSectionDisplayed(sectionName));
    }

    // Scenario: Dropdown dismissal when clicking outside
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String menuName) {
        homePage.openDropdownMenu(menuName);
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        homePage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(homePage.isDropdownMenuOpen());
    }

    // Scenario: Dropdown dismissal when selecting another navigation item
    @When("I click on the {string} navigation item")
    public void i_click_on_the_navigation_item(String navItem) {
        homePage.clickNavigationItem(navItem);
    }

    // Scenario: Invalid option selection
    @And("I select an option that does not exist")
    public void i_select_an_option_that_does_not_exist() {
        homePage.selectInvalidDropdownOption();
    }

    @Then("I should see an error message indicating the option is invalid")
    public void i_should_see_an_error_message_indicating_the_option_is_invalid() {
        Assertions.assertTrue(homePage.isErrorMessageDisplayed());
    }
}