package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import org.junit.jupiter.api.Assertions;

public class NavigationBarTest {
    MainPage mainPage;

    public NavigationBarTest() {
        mainPage = new MainPage();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenu) {
        mainPage.getDropdownMenu(dropdownMenu).click();
    }

    @Then("I should see options such as {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option1));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option2));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option3));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option4));
        Assertions.assertTrue(mainPage.getDropdownOptions().contains(option5));
    }

    @Given("the {string} dropdown menu is open")
    public void the_dropdown_menu_is_open(String dropdownMenu) {
        Assertions.assertTrue(mainPage.getDropdownMenu(dropdownMenu).isDisplayed());
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        mainPage.getOption(option).click();
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String section) {
        Assertions.assertEquals(mainPage.getCurrentUrl(), mainPage.getSectionUrl(section));
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        mainPage.clickAnotherNavItem();
    }
}