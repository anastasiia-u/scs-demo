package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.SolutionsPage;

public class SolutionsMenuTest {
    SolutionsPage solutionsPage;

    public SolutionsMenuTest() {
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the Harman website")
    public void i_am_on_the_harman_website() {
        solutionsPage.navigateToHarmanWebsite();
    }

    @When("I hover over the Solutions menu")
    public void i_hover_over_the_solutions_menu() {
        solutionsPage.hoverOverSolutionsMenu();
    }

    @Then("the Innovations dropdown should be visible")
    public void the_innovations_dropdown_should_be_visible() {
        Assertions.assertTrue(solutionsPage.isInnovationsDropdownVisible(),
                "Innovations dropdown is not visible.");
    }

    @And("I select {string} from the Innovations dropdown")
    public void i_select_from_the_innovations_dropdown(String option) {
        solutionsPage.selectOptionFromInnovationsDropdown(option);
    }

    @Then("I should be redirected to the {string} page")
    public void i_should_be_redirected_to_the_page(String expectedPageTitle) {
        String actualPageTitle = solutionsPage.getCurrentPageTitle();
        Assertions.assertEquals(expectedPageTitle, actualPageTitle,
                "The page title does not match the expected page title.");
    }

    @When("I click outside the Innovations dropdown")
    public void i_click_outside_the_innovations_dropdown() {
        solutionsPage.clickOutsideInnovationsDropdown();
    }

    @Then("the Innovations dropdown should close")
    public void the_innovations_dropdown_should_close() {
        Assertions.assertFalse(solutionsPage.isInnovationsDropdownVisible(),
                "Innovations dropdown did not close.");
    }
}