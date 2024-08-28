package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.InnovationsPage;
import org.junit.jupiter.api.Assertions;

public class InnovationsDropdownSteps {

    InnovationsPage innovationsPage;

    public InnovationsDropdownSteps() {
        innovationsPage = new InnovationsPage();
    }

    // Scenario: Dropdown Visibility - Innovations dropdown appears with all options
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        innovationsPage.navigateToHomepage(); // Assuming navigateToHomepage() opens the homepage URL
    }

    @When("I click on the {string} dropdown menu in the main navigation bar")
    public void i_click_on_the_dropdown_menu_in_the_main_navigation_bar(String dropdownName) {
        innovationsPage.clickOnDropdown(dropdownName); // Assuming clickOnDropdown(String dropdownName) clicks on specified dropdown
    }

    @Then("the dropdown should display with options {string}, {string}, {string}, {string}, and {string}")
    public void the_dropdown_should_display_with_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(innovationsPage.isOptionVisible(option1)); // Assuming isOptionVisible(String option) checks if an option is visible in the dropdown
        Assertions.assertTrue(innovationsPage.isOptionVisible(option2));
        Assertions.assertTrue(innovationsPage.isOptionVisible(option3));
        Assertions.assertTrue(innovationsPage.isOptionVisible(option4));
        Assertions.assertTrue(innovationsPage.isOptionVisible(option5));
    }

    // Scenario: Option Navigation - Clicking on dropdown options navigates correctly
    @Given("I have clicked on the {string} dropdown menu")
    public void i_have_clicked_on_the_dropdown_menu(String dropdownName) {
        innovationsPage.clickOnDropdown(dropdownName);
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        innovationsPage.clickOnOption(optionName); // Assuming clickOnOption(String optionName) clicks on specified option in the dropdown
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertEquals(innovationsPage.getCurrentSection(), sectionName); // Assuming getCurrentSection() returns the name of the current section
    }

    // Scenario: Dropdown Dismissal - Dropdown closes when interacting outside of it
    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        innovationsPage.openDropdown(dropdownName); // Assuming openDropdown(String dropdownName) explicitly opens the dropdown
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        innovationsPage.clickOutsideDropdown(); // Assuming clickOutsideDropdown() simulates a click outside the dropdown area
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(innovationsPage.isDropdownOpen()); // Assuming isDropdownOpen() checks if the dropdown is currently open
    }
}
