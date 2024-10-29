package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class AccessSolutionsDropdownMenu {
    MainPage mainPage;

    public AccessSolutionsDropdownMenu() {
        mainPage = new MainPage();
    }

    // Scenario: Dropdown appears with all necessary options
    @Given("I am on the main page of the website")
    public void i_am_on_the_main_page_of_the_website() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu in the main navigation bar")
    public void i_click_on_the_dropdown_menu_in_the_main_navigation_bar(String dropdownName) {
        mainPage.getDropdownMenu(dropdownName).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option1));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option2));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option3));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option4));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option5));
    }

    // Scenario: Each dropdown option is clickable and navigates correctly
    @When("I click on each option in the {string} dropdown menu")
    public void i_click_on_each_option_in_the_dropdown_menu(String dropdownName) {
        mainPage.clickEachDropdownOption(dropdownName);
    }

    @Then("I should be navigated to the corresponding section of the website")
    public void i_should_be_navigated_to_the_corresponding_section_of_the_website() {
        Assertions.assertTrue(mainPage.isNavigatedCorrectly());
    }

    // Scenario: Dropdown closes when interacting outside of it
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        mainPage.openDropdownMenu(dropdownName);
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    // Scenario: Dropdown closes when interacting with other navigation items
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainPage.clickAnotherNavigationItem();
    }
}