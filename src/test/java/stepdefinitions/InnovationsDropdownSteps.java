package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {

    private MainPage mainPage;

    public InnovationsDropdownSteps() {
        mainPage = new MainPage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        mainPage.navigateToHomePage();
    }

    @When("I click on the \"Innovations\" dropdown menu")
    public void i_click_on_the_innovations_dropdown_menu() {
        mainPage.clickOnInnovations();
    }

    @Then("I should see the dropdown with options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void i_should_see_the_dropdown_with_options() {
        Assertions.assertTrue(mainPage.isDropdownOptionsVisible());
    }

    @And("I click on one of the options like \"Automotive\"")
    public void i_click_on_one_of_the_options_like_automotive() {
        mainPage.clickOnOption("Automotive");
    }

    @Then("I should be navigated to the \"Automotive\" section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection());
    }

    @Given("I have opened the \"Innovations\" dropdown menu")
    public void i_have_opened_the_innovations_dropdown_menu() {
        mainPage.openInnovationsDropdown();
    }

    @When("I click anywhere outside of the \"Innovations\" dropdown menu")
    public void i_click_anywhere_outside_of_the_innovations_dropdown() {
        mainPage.clickOutsideDropdown();
    }

    @Then("the \"Innovations\" dropdown should close")
    public void the_innovations_dropdown_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }
}