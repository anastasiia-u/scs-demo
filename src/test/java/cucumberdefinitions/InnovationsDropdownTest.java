package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pageobjects.MainPage;
import org.junit.jupiter.api.Assertions;

public class InnovationsDropdownTest {
    MainPage mainPage = new MainPage();

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        mainPage.open();
    }

    @Given("I have opened the \"Innovations\" dropdown menu")
    public void i_have_opened_the_innovations_dropdown_menu() {
        mainPage.getInnovationsDropdown().click();
    }

    @When("I click on the \"Innovations\" dropdown menu")
    public void i_click_on_the_innovations_dropdown_menu() {
        mainPage.getInnovationsDropdown().click();
    }

    @When("I click on the \"Automotive\" option")
    public void i_click_on_the_automotive_option() {
        mainPage.getAutomotiveOption().click();
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        mainPage.clickOutsideDropdown();
    }

    @Then("I should see the dropdown menu appear with the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void i_should_see_the_dropdown_menu_appear_with_the_options() {
        Assertions.assertTrue(mainPage.getDropdownOptions().containsAll(List.of("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions")));
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assertions.assertTrue(mainPage.getCurrentUrl().contains("automotive"));
    }

    @Then("the \"Innovations\" dropdown menu should close")
    public void the_innovations_dropdown_menu_should_close() {
        Assertions.assertFalse(mainPage.isDropdownOpen());
    }
}