package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import pageobjects.SolutionsDropdown;

public class TestSolutionsDropdown {
    MainPage mainPage;
    SolutionsDropdown solutionsDropdown;

    public TestSolutionsDropdown() {
        mainPage = new MainPage();
        solutionsDropdown = new SolutionsDropdown();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenuName) {
        mainPage.getDropdownMenu(dropdownMenuName).click();
    }

    @Then("I should see options such as {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options_such_as(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(solutionsDropdown.getOption(option1).isDisplayed());
        Assertions.assertTrue(solutionsDropdown.getOption(option2).isDisplayed());
        Assertions.assertTrue(solutionsDropdown.getOption(option3).isDisplayed());
        Assertions.assertTrue(solutionsDropdown.getOption(option4).isDisplayed());
        Assertions.assertTrue(solutionsDropdown.getOption(option5).isDisplayed());
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        solutionsDropdown.getOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String sectionName) {
        Assertions.assertEquals(mainPage.getCurrentUrl(), mainPage.getSectionUrl(sectionName));
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(solutionsDropdown.isDisplayed());
    }

    @When("I attempt to select an option that does not exist")
    public void i_attempt_to_select_an_option_that_does_not_exist() {
        solutionsDropdown.selectInvalidOption();
    }

    @Then("I should see an error message indicating the option is invalid")
    public void i_should_see_an_error_message_indicating_the_option_is_invalid() {
        Assertions.assertTrue(mainPage.getErrorMessage().isDisplayed());
    }
}
