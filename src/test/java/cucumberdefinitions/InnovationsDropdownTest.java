package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.HarmanMainPage;

public class InnovationsDropdownTest {
    HarmanMainPage harmanMainPage;

    public InnovationsDropdownTest() {
        harmanMainPage = new HarmanMainPage();
    }

    @Given("^I am on the main page$")
    public void i_am_on_the_main_page() {
        harmanMainPage.openMainPage();
    }

    @When("^I click on the \"Innovations\" dropdown menu$")
    public void i_click_on_the_innovations_dropdown_menu() {
        harmanMainPage.clickInnovationsDropdown();
    }

    @Then("^I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"$")
    public void i_should_see_the_options() {
        Assertions.assertTrue(harmanMainPage.areInnovationsOptionsDisplayed());
    }

    @And("^I select the \"Automotive\" option$")
    public void i_select_the_automotive_option() {
        harmanMainPage.selectAutomotiveOption();
    }

    @Then("^I should be navigated to the \"Automotive\" section of the website$")
    public void i_should_be_navigated_to_the_automotive_section() {
        Assertions.assertTrue(harmanMainPage.isAutomotiveSectionDisplayed());
    }

    @When("^I click anywhere outside the dropdown area$")
    public void i_click_anywhere_outside_the_dropdown_area() {
        harmanMainPage.clickOutsideDropdown();
    }

    @Then("^the \"Innovations\" dropdown menu should close$")
    public void the_innovations_dropdown_menu_should_close() {
        Assertions.assertFalse(harmanMainPage.isInnovationsDropdownDisplayed());
    }
}