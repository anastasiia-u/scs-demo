package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class SolutionsDropdownSteps {

    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.openHomePage();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownName) {
        mainPage.clickOnDropdown(dropdownName);
    }

    @Then("I should see the options {string}")
    public void i_should_see_the_options(String expectedOptions) {
        Assertions.assertTrue(mainPage.verifyDropdownOptions(expectedOptions.split(", ")));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        mainPage.selectDropdownOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String section) {
        Assertions.assertTrue(mainPage.isAtSection(section));
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String dropdownName) {
        Assertions.assertFalse(mainPage.isDropdownOpen(dropdownName));
    }

}

// Note: The PageObject methods used in this step definitions (e.g., openHomePage(), clickOnDropdown(), verifyDropdownOptions(), selectDropdownOption(), isAtSection(), clickOutsideDropdown(), isDropdownOpen()) are assumed to be implemented in the MainPage class. If any of these methods are missing, please implement them accordingly or adjust the step definitions if the PageObject design differs.