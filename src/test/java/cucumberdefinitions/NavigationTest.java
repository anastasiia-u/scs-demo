package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;
import org.junit.jupiter.api.Assertions;

public class NavigationTest {
    MainPage mainPage;
    SolutionsPage solutionsPage;

    public NavigationTest() {
        mainPage = new MainPage();
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenuName) {
        mainPage.getDropdownMenu(dropdownMenuName).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.isOptionVisible(option1));
        Assertions.assertTrue(mainPage.isOptionVisible(option2));
        Assertions.assertTrue(mainPage.isOptionVisible(option3));
        Assertions.assertTrue(mainPage.isOptionVisible(option4));
        Assertions.assertTrue(mainPage.isOptionVisible(option5));
    }

    @Given("the {string} dropdown menu is visible")
    public void the_dropdown_menu_is_visible(String dropdownMenuName) {
        Assertions.assertTrue(mainPage.isDropdownMenuVisible(dropdownMenuName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainPage.getOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertEquals(sectionName, solutionsPage.getCurrentSection());
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownMenuVisible());
    }

    @When("I attempt to click on a non-existent option {string}")
    public void i_attempt_to_click_on_a_non_existent_option(String invalidOption) {
        mainPage.getOption(invalidOption).click();
    }

    @Then("I should not be navigated anywhere and see an error message")
    public void i_should_not_be_navigated_anywhere_and_see_an_error_message() {
        Assertions.assertTrue(mainPage.isErrorMessageVisible());
    }
}
