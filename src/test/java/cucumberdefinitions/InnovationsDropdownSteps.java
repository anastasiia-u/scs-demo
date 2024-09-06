package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageobjects.InnovationsDropdownPage;

public class InnovationsDropdownSteps {

    private InnovationsDropdownPage innovationsDropdownPage;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        innovationsDropdownPage.openHomePage();
    }

    @Given("I have opened the "Innovations" dropdown menu")
    public void i_have_opened_the_innovations_dropdown_menu() {
        innovationsDropdownPage.clickInnovationsDropdown();
    }

    @When("I click on the "Innovations" dropdown menu")
    public void i_click_on_the_innovations_dropdown_menu() {
        innovationsDropdownPage.clickInnovationsDropdown();
    }

    @When("I click on any option in the dropdown")
    public void i_click_on_any_option_in_the_dropdown() {
        // This step would be implemented with parameterization to handle different options
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        innovationsDropdownPage.closeDropdownByClickingOutside();
    }

    @When("I click on any other navigation item")
    public void i_click_on_any_other_navigation_item() {
        // This step would be implemented to click on different navigation items
    }

    @Then("I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"")
    public void i_should_see_the_dropdown_options() {
        Assertions.assertTrue(innovationsDropdownPage.isOptionVisible("Automotive"));
        Assertions.assertTrue(innovationsDropdownPage.isOptionVisible("Lifestyle"));
        Assertions.assertTrue(innovationsDropdownPage.isOptionVisible("Consumer"));
        Assertions.assertTrue(innovationsDropdownPage.isOptionVisible("Professional"));
        Assertions.assertTrue(innovationsDropdownPage.isOptionVisible("Digital Transformation Solutions"));
    }

    @Then("I should be navigated to the corresponding section of the website")
    public void i_should_be_navigated_to_the_corresponding_section_of_the_website() {
        // This step would be implemented to verify navigation to the correct section
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        // This step would be implemented to verify that the dropdown has closed
    }
}
