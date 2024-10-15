package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;

public class NavigationTest {
    MainPage mainPage;
    SolutionsPage solutionsPage;

    public NavigationTest() {
        mainPage = new MainPage();
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenu) {
        mainPage.getDropdownMenu(dropdownMenu).click();
    }

    @Then("I should see the following options:")
    public void i_should_see_the_following_options(List<String> options) {
        Assertions.assertEquals(options, mainPage.getDropdownOptions());
    }

    @And("I select the {string} option")
    public void i_select_the_option(String option) {
        mainPage.getOption(option).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertEquals(section, solutionsPage.getCurrentSection());
    }

    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownMenu) {
        mainPage.getDropdownMenu(dropdownMenu).click();
        Assertions.assertTrue(mainPage.isDropdownOpen(dropdownMenu));
    }

    @When("I click outside the dropdown")
    public void i_click_outside_the_dropdown() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the {string} dropdown menu should close")
    public void the_dropdown_menu_should_close(String dropdownMenu) {
        Assertions.assertFalse(mainPage.isDropdownOpen(dropdownMenu));
    }

    @When("I click on the {string} navigation item")
    public void i_click_on_the_navigation_item(String navigationItem) {
        mainPage.getNavigationItem(navigationItem).click();
    }

    @And("I should be navigated to the homepage")
    public void i_should_be_navigated_to_the_homepage() {
        Assertions.assertTrue(mainPage.isOnHomepage());
    }
}
