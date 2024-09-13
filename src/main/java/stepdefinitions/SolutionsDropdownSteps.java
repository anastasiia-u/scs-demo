package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.SolutionsPage;

public class SolutionsDropdownSteps {
    SolutionsPage solutionsPage = new SolutionsPage();

    @Given("I am on the main page of the website")
    public void i_am_on_the_main_page_of_the_website() {
        solutionsPage.openMainPage();
    }

    @Given("the \"Solutions\" dropdown menu is open")
    @When("I click on the \"Solutions\" dropdown menu")
    public void i_click_on_the_solutions_dropdown_menu() {
        solutionsPage.clickSolutionsDropdown();
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown() {
        solutionsPage.clickOutsideDropdown();
    }

    @When("I click on the \"Automotive\" option")
    public void i_click_on_the_automotive_option() {
        solutionsPage.clickOption("Automotive");
    }

    @Then("the dropdown should display options \"Automotive, Lifestyle, Consumer, Professional, and Digital Transformation Solutions\"")
    public void the_dropdown_should_display_options() {
        Assertions.assertTrue(solutionsPage.isOptionVisible("Automotive"));
        Assertions.assertTrue(solutionsPage.isOptionVisible("Lifestyle"));
        Assertions.assertTrue(solutionsPage.isOptionVisible("Consumer"));
        Assertions.assertTrue(solutionsPage.isOptionVisible("Professional"));
        Assertions.assertTrue(solutionsPage.isOptionVisible("Digital Transformation Solutions"));
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section() {
        // Assertions should be implemented based on the page URL or content verification after navigation
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void the_solutions_dropdown_menu_should_close() {
        // Assertions should be implemented based on the dropdown status check
    }

    @Then("the dropdown should not display any options")
    public void the_dropdown_should_not_display_any_options() {
        // Assertions should be implemented based on the options visibility check
    }

    @And("each option should be clickable")
    public void each_option_should_be_clickable() {
        // Assertions should be implemented based on the options click-ability check
    }

    @And("a message \"Failed to load options, please try again later\" should be shown")
    public void a_message_should_be_shown() {
        Assertions.assertEquals("Failed to load options, please try again later", solutionsPage.getFailureMessage());
    }
}
