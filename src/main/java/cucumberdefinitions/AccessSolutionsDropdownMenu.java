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

    // Scenario: Dropdown appears with all necessary options
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        homePage.getDropdownMenu(menuName).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(homePage.isOptionVisible(option1));
        Assertions.assertTrue(homePage.isOptionVisible(option2));
        Assertions.assertTrue(homePage.isOptionVisible(option3));
        Assertions.assertTrue(homePage.isOptionVisible(option4));
        Assertions.assertTrue(homePage.isOptionVisible(option5));
    }

    // Scenario: Navigate to Automotive section
    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        homePage.selectOption(option);
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertTrue(homePage.isSectionDisplayed(section));
    }

    // Scenario: Dropdown closes when clicking outside
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

    // Scenario: Dropdown closes when selecting another navigation item
    @When("I click on the {string} navigation item")
    public void i_click_on_the_navigation_item(String navItem) {
        homePage.clickNavigationItem(navItem);
    }

    // Scenario: Dropdown does not appear when clicking on a non-dropdown area
    @Then("the {string} dropdown menu should not appear")
    public void the_dropdown_menu_should_not_appear(String menuName) {
        Assertions.assertFalse(homePage.isDropdownMenuVisible(menuName));
    }
}