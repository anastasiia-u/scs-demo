package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;

import org.junit.jupiter.api.Assertions;

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
        mainPage.getDropdownMenu(dropdownName).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(Arrays.asList(option1, option2, option3, option4, option5)));
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        mainPage.getDropdownMenu(dropdownName).click();
        Assertions.assertTrue(mainPage.isDropdownOpen(dropdownName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainPage.getDropdownOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertEquals(sectionName, solutionsPage.getCurrentSection());
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @When("I click on a disabled area of the {string} dropdown")
    public void i_click_on_a_disabled_area_of_the_dropdown(String dropdownName) {
        mainPage.clickOnDisabledAreaOfDropdown(dropdownName);
    }

    @Then("the dropdown menu should not open")
    public void the_dropdown_menu_should_not_open() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }
}
