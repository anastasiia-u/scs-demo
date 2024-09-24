package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;

import pageobjects.MainPage;
import pageobjects.SolutionsPage;

public class TestSolutionsDropdown {
    MainPage mainPage;
    SolutionsPage solutionsPage;

    public TestSolutionsDropdown() {
        mainPage = new MainPage();
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        mainPage.getDropdown(dropdownName).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(Arrays.asList(option1, option2, option3, option4, option5)));
    }

    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        mainPage.getDropdownOption(option).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertEquals(solutionsPage.getCurrentSection(), section);
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        mainPage.getDropdown(dropdownName).click();
        Assertions.assertTrue(mainPage.isDropdownOpen(dropdownName));
    }

    @When("I click outside the dropdown")
    public void i_click_outside_the_dropdown() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainPage.clickOnAnotherNavItem();
    }

    @When("I do not click on the {string} dropdown menu")
    public void i_do_not_click_on_the_dropdown_menu(String dropdownName) {
        // Do nothing
    }

    @Then("the dropdown should not appear")
    public void the_dropdown_should_not_appear() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }
}
