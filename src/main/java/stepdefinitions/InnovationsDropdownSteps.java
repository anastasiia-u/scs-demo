package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.InnovationsDropdownPage;

public class InnovationsDropdownSteps {

  private InnovationsDropdownPage innovationsDropdownPage;

  public InnovationsDropdownSteps(InnovationsDropdownPage innovationsDropdownPage) {
    this.innovationsDropdownPage = innovationsDropdownPage;
  }

  @Given("the user is on the homepage")
  public void the_user_is_on_the_homepage() {
    // Code to navigate to the homepage
  }

  @When("the user clicks on the Innovations dropdown")
  public void the_user_clicks_on_the_Innovations_dropdown() {
    innovationsDropdownPage.clickInnovationsDropdown();
  }

  @Then("the dropdown should expand showing all the sections")
  public void the_dropdown_should_expand_showing_all_the_sections() {
    // Code to verify dropdown is expanded
  }

  // Additional step definitions for other scenarios
}