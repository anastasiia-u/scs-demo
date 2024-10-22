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
    public void i_click_on_the_dropdown_menu(String dropdownMenu) {
        mainPage.getDropdownMenu(dropdownMenu).click();
    }

    @Then("I should see options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(Arrays.asList(option1, option2, option3, option4, option5)));
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownMenu) {
        Assertions.assertTrue(mainPage.getDropdownMenu(dropdownMenu).isOpen());
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        mainPage.getDropdownOption(option).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertEquals(section, solutionsPage.getCurrentSection());
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen());
    }

    @When("I attempt to click on a non-existent option {string}")
    public void i_attempt_to_click_on_a_non_existent_option(String invalidOption) {
        mainPage.getDropdownOption(invalidOption).click();
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertNull(solutionsPage.getCurrentSection());
    }
}