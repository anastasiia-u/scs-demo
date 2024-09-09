package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {

    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.openHomePage();
    }

    @When("I click on the \"Innovations\" dropdown menu")
    public void i_click_on_the_innovations_dropdown_menu() {
        mainPage.clickInnovationsDropdown();
    }

    @Then("I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void i_should_see_the_options_in_dropdown() {
        Assertions.assertTrue(mainPage.isOptionsVisible("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions"));
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the \"Innovations\" dropdown menu should close")
    public void the_innovations_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }

    @When("I hover over the options within the dropdown")
    public void i_hover_over_the_options_within_the_dropdown() {
        mainPage.hoverOverOptions();
    }

    @Then("the \"Innovations\" dropdown menu should remain open")
    public void the_innovations_dropdown_menu_should_remain_open() {
        Assertions.assertTrue(mainPage.isDropdownOpen());
    }

    @And("I click on the \"Automotive\" option in the dropdown")
    public void i_click_on_the_automotive_option_in_the_dropdown() {
        mainPage.clickAutomotiveOption();
    }

    @Then("I should be navigated to the \"Automotive\" section of the website")
    public void i_should_be_navigated_to_the_automotive_section() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection());
    }

    @And("I click on an option not listed in the dropdown")
    public void i_click_on_an_option_not_listed_in_the_dropdown() {
        mainPage.clickUnlistedOption();
    }

    @Then("I should see a \"Page not found\" error message")
    public void i_should_see_a_page_not_found_error_message() {
        Assertions.assertTrue(mainPage.isPageNotFoundVisible());
    }
}