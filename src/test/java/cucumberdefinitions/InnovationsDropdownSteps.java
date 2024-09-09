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
        mainPage.openHomePage();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        mainPage.clickOnDropdownMenu(menuName);
    }

    @Then("I should see the following options:")
    public void i_should_see_the_following_options(List<String> options) {
        Assertions.assertTrue(mainPage.verifyDropdownOptions(options), "Not all options are displayed correctly.");
    }

    @And("I have clicked on the {string} dropdown menu")
    public void i_have_clicked_on_the_dropdown_menu(String menuName) {
        mainPage.clickOnDropdownMenu(menuName);
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainPage.selectDropdownOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertTrue(mainPage.isOnSectionPage(sectionName), "Navigation to the section failed.");
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen(), "Dropdown menu did not close.");
    }

    @When("I hover over the {string} dropdown menu but do not click")
    public void i_hover_over_the_dropdown_menu_but_do_not_click(String menuName) {
        mainPage.hoverOverDropdownMenu(menuName);
    }

    @Then("the dropdown menu should not display any options")
    public void the_dropdown_menu_should_not_display_any_options() {
        Assertions.assertFalse(mainPage.isDropdownOptionsVisible(), "Dropdown options are incorrectly displayed.");
    }
}