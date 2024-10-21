package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;

public class NavigationBarTest {
    MainPage mainPage;
    SolutionsPage solutionsPage;

    public NavigationBarTest() {
        mainPage = new MainPage();
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        mainPage.getDropdownMenu(menuName).click();
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
        Assertions.assertEquals(section, solutionsPage.getSectionTitle());
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String menuName) {
        mainPage.getDropdownMenu(menuName).click();
        Assertions.assertTrue(mainPage.isDropdownMenuOpen(menuName));
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen());
    }

    @When("I click on a disabled option in the {string} dropdown menu")
    public void i_click_on_a_disabled_option_in_the_dropdown_menu(String menuName) {
        mainPage.getDisabledOption(menuName).click();
    }

    @Then("the dropdown menu should not open")
    public void the_dropdown_menu_should_not_open() {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen());
    }
}