package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;
import org.junit.jupiter.api.Assertions;

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
        Assertions.assertTrue(mainPage.isOptionVisible(option1));
        Assertions.assertTrue(mainPage.isOptionVisible(option2));
        Assertions.assertTrue(mainPage.isOptionVisible(option3));
        Assertions.assertTrue(mainPage.isOptionVisible(option4));
        Assertions.assertTrue(mainPage.isOptionVisible(option5));
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String menuName) {
        mainPage.getDropdownMenu(menuName).click();
        Assertions.assertTrue(mainPage.isDropdownMenuOpen(menuName));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainPage.getOption(optionName).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String sectionName) {
        Assertions.assertEquals(solutionsPage.getCurrentSection(), sectionName);
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownMenuOpen());
    }

    @When("I click on a non-dropdown area")
    public void i_click_on_a_non_dropdown_area() {
        mainPage.clickOnNonDropdownArea();
    }

    @Then("the {string} dropdown menu should not appear")
    public void the_dropdown_menu_should_not_appear(String menuName) {
        Assertions.assertFalse(mainPage.isDropdownMenuVisible(menuName));
    }
}