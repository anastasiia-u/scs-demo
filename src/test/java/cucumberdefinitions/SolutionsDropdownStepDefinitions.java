package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.Arrays;
import java.util.List;

public class SolutionsDropdownStepDefinitions {
    MainPage mainPage = new MainPage();

    @Given("I am on the main page of the website")
    public void i_am_on_the_main_page_of_the_website() {
        mainPage.navigateToMainPage();
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void i_click_on_the_solutions_dropdown_menu() {
        mainPage.clickSolutionsDropdown();
    }

    @Then("I should see the dropdown menu with the options {string}")
    public void i_should_see_the_dropdown_menu_with_options(String options) {
        List<String> expectedOptions = Arrays.asList(options.split(", "));
        Assertions.assertTrue(mainPage.getSolutionsDropdownOptions().containsAll(expectedOptions), "Not all expected options are visible.");
    }

    // Additional step definitions...
}