package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.HarmanMainPage;

public class InnovationsDropdownSteps {

    HarmanMainPage harmanMainPage = new HarmanMainPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        harmanMainPage.openHomePage();
    }

    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String menuName) {
        if ("Innovations".equals(menuName)) {
            harmanMainPage.clickSolutionsDropdownMenu();
        }
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String menuName) {
        if ("Innovations".equals(menuName)) {
            harmanMainPage.clickSolutionsDropdownMenu();
        }
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        harmanMainPage.clickOutsideDropdownArea();
    }

    @And("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        switch (optionName) {
            case "Automotive":
                harmanMainPage.navigateToAutomotiveSection();
                break;
            case "Lifestyle":
                harmanMainPage.navigateToLifestyleSection();
                break;
            case "Consumer":
                harmanMainPage.navigateToConsumerSection();
                break;
            case "Professional":
                harmanMainPage.navigateToProfessionalSection();
                break;
            case "Digital Transformation Solutions":
                harmanMainPage.navigateToDigitalTransformationSolutionsSection();
                break;
            default:
                Assertions.fail("Option '" + optionName + "' not recognized.");
        }
    }

    @Then("I should see the dropdown options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_dropdown_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option1));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option2));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option3));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option4));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option5));
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assertions.assertTrue(harmanMainPage.isOnAutomotiveSection());
    }

    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String menuName) {
        if ("Innovations".equals(menuName)) {
            Assertions.assertFalse(harmanMainPage.isSolutionsDropdownMenuVisible());
        }
    }
}