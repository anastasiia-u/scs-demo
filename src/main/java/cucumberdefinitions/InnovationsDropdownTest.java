package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownTest {
    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.openHomePage();
    }

    @When("I click on the \"([^\"]*)\" dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        mainPage.getDropdownByName(dropdownName).click();
    }

    @Then("I should see the options \"([^\"]*)\"")
    public void i_should_see_the_options(String expectedOptions) {
        String[] options = expectedOptions.split(", ");
        for (String option : options) {
            Assertions.assertTrue(mainPage.getDropdownOptions().contains(option),
                                  "Expected option '" + option + "' not found in dropdown.");
        }
    }

    @And("I have opened the \"([^\"]*)\" dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownName) {
        mainPage.getDropdownByName(dropdownName).click();
    }

    @When("I click on the \"([^\"]*)\" option")
    public void i_click_on_the_option(String optionName) {
        mainPage.getOptionByName(optionName).click();
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assertions.assertTrue(mainPage.isCurrentPageAutomotive(),
                              "Not navigated to the Automotive section.");
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the \"([^\"]*)\" dropdown menu should close")
    public void the_dropdown_menu_should_close(String dropdownName) {
        Assertions.assertFalse(mainPage.isDropdownOpen(dropdownName),
                               "Dropdown '" + dropdownName + "' should be closed.");
    }
}
