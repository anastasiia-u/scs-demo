package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {
    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.open(); // Opens the homepage
    }

    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String menuName) {
        if(menuName.equals("Innovations")) {
            mainPage.clickSolutionsDropdown(); // Clicks on the Innovations (Solutions) dropdown
        }
        // Add more cases for different menus if needed
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        if(menuName.equals("Innovations")) {
            mainPage.clickSolutionsDropdown(); // Clicks on the Innovations (Solutions) dropdown
        }
        // Add more cases for different menus if needed
    }

    @When("I click outside the dropdown area")
    public void i_click_outside_the_dropdown_area() {
        mainPage.clickOutsideDropdown(); // Simulates clicking outside the dropdown to close it
    }

    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainPage.clickAnotherNavItem(); // Clicks on another navigation item to close the dropdown
    }

    @And("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        switch (optionName) {
            case "Automotive":
                mainPage.clickAutomotiveOption(); // Clicks on the Automotive option
                break;
            case "Lifestyle":
                // Add method to click on Lifestyle option
                break;
            case "Consumer":
                // Add method to click on Consumer option
                break;
            case "Professional":
                // Add method to click on Professional option
                break;
            case "Digital Transformation Solutions":
                // Add method to click on Digital Transformation Solutions option
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + optionName);
        }
    }

    @Then("I should see the dropdown menu with options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_dropdown_menu_with_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.verifyDropdownOptions(option1, option2, option3, option4, option5)); // Verifies that the dropdown contains specified options
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assertions.assertTrue(mainPage.isOnAutomotivePage()); // Asserts that the current page is the Automotive section
    }

    @Then("the {string} dropdown menu should close")
    public void the_dropdown_menu_should_close(String menuName) {
        if(menuName.equals("Innovations")) {
            Assertions.assertFalse(mainPage.isSolutionsDropdownOpen()); // Asserts that the Innovations (Solutions) dropdown is closed
        }
        // Add more cases for different menus if needed
    }
}