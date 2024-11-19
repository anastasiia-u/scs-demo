package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainNavigationBar;

public class SolutionsDropdownFunctionality {
    MainNavigationBar mainNavigationBar;

    public SolutionsDropdownFunctionality() {
        mainNavigationBar = new MainNavigationBar();
    }

    // Scenario: Dropdown Visibility
    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainNavigationBar.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        mainNavigationBar.getDropdownMenu(menuName).click();
    }

    @Then("I should see options such as {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option1));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option2));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option3));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option4));
        Assertions.assertTrue(mainNavigationBar.isOptionVisible(option5));
    }

    // Scenario: Option Navigation
    @Given("the {string} dropdown menu is visible")
    public void the_dropdown_menu_is_visible(String menuName) {
        mainNavigationBar.openDropdownMenu(menuName);
        Assertions.assertTrue(mainNavigationBar.isDropdownMenuVisible(menuName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainNavigationBar.getOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(mainNavigationBar.isSectionDisplayed(sectionName));
    }

    // Scenario: Dropdown Dismissal
    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainNavigationBar.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainNavigationBar.isDropdownMenuVisible("Solutions"));
    }

    // Scenario: Invalid Option Selection
    @When("I attempt to select an option that does not exist")
    public void i_attempt_to_select_an_option_that_does_not_exist() {
        mainNavigationBar.selectInvalidOption();
    }

    @Then("I should see an error message indicating the option is invalid")
    public void i_should_see_an_error_message_indicating_the_option_is_invalid() {
        Assertions.assertTrue(mainNavigationBar.isErrorMessageDisplayed("Invalid option selected"));
    }
}