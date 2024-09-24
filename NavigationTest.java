package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import pageobjects.SolutionsDropdown;

public class NavigationTest {
    MainPage mainPage;
    SolutionsDropdown solutionsDropdown;

    public NavigationTest() {
        mainPage = new MainPage();
        solutionsDropdown = new SolutionsDropdown();
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
        Assertions.assertTrue(solutionsDropdown.getOptions().containsAll(Arrays.asList(option1, option2, option3, option4, option5)));
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownName) {
        Assertions.assertTrue(mainPage.getDropdown(dropdownName).isOpen());
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        solutionsDropdown.getOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertEquals(sectionName, mainPage.getCurrentSection());
    }

    @When("I click outside the dropdown")
    public void i_click_outside_the_dropdown() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(solutionsDropdown.isOpen());
    }

    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainPage.getAnotherNavigationItem().click();
    }

    @When("I attempt to select a non-existent option {string}")
    public void i_attempt_to_select_a_non_existent_option(String invalidOption) {
        solutionsDropdown.getOption(invalidOption).click();
    }

    @Then("I should see an error message or no action should occur")
    public void i_should_see_an_error_message_or_no_action_should_occur() {
        Assertions.assertTrue(mainPage.isErrorMessageDisplayed() || !solutionsDropdown.isOpen());
    }
}
