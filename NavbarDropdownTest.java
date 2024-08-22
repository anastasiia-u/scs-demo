package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class NavbarDropdownTest {

    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.open();
    }

    @When("I click on the {string} dropdown in the navigation bar")
    public void i_click_on_the_dropdown_in_the_navigation_bar(String section) {
        mainPage.clickNavbarDropdown(section);
    }

    @Then("the dropdown should display options including {string}, {string}, and {string}")
    public void the_dropdown_should_display_options_including(String option1, String option2, String option3) {
        Assertions.assertTrue(mainPage.isOptionVisible(option1));
        Assertions.assertTrue(mainPage.isOptionVisible(option2));
        Assertions.assertTrue(mainPage.isOptionVisible(option3));
    }
    
    @And("all options should be clickable and lead to the correct page")
    public void all_options_should_be_clickable_and_lead_to_the_correct_page() {
        Assertions.assertTrue(mainPage.areOptionsClickableAndLeadToCorrectPage());
    }

    @Given("I have opened a dropdown menu in the navigation bar")
    public void i_have_opened_a_dropdown_menu_in_the_navigation_bar() {
        mainPage.openDropdownMenu();
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @Then("the dropdown should display the correct options")
    public void the_dropdown_should_display_the_correct_options() {
        Assertions.assertTrue(mainPage.areCorrectOptionsDisplayed());
    }

    @Given("I have opened the {string} dropdown in the navigation bar")
    public void i_have_opened_the_dropdown_in_the_navigation_bar(String section) {
        mainPage.openSpecificDropdown(section);
    }

    @When("I click on the {string} item in the navigation bar")
    public void i_click_on_the_item_in_the_navigation_bar(String item) {
        mainPage.clickNavbarItem(item);
    }

    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String section) {
        Assertions.assertFalse(mainPage.isSpecificDropdownOpen(section));
    }

    @And("the {string} dropdown should open displaying its options")
    public void the_dropdown_should_open_displaying_its_options(String section) {
        Assertions.assertTrue(mainPage.isSpecificDropdownOpenWithOptions(section));
    }
}