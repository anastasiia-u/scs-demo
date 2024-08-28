package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.HarmanMainPage;

public class InnovationsDropdownSteps {
    
    HarmanMainPage harmanMainPage;

    public InnovationsDropdownSteps() {
        harmanMainPage = new HarmanMainPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        harmanMainPage.openMainPage();
    }

    @When("I click on the {string} dropdown menu in the main navigation bar")
    public void i_click_on_the_dropdown_menu_in_the_main_navigation_bar(String menuName) {
        harmanMainPage.clickInnovationsDropdown();
    }

    @Then("the dropdown should display options {string}, {string}, {string}, {string}, and {string}")
    public void the_dropdown_should_display_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option1));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option2));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option3));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option4));
        Assertions.assertTrue(harmanMainPage.isOptionVisible(option5));
    }

    @And("I have clicked on the {string} dropdown menu in the main navigation bar")
    public void i_have_clicked_on_the_dropdown_menu_in_the_main_navigation_bar(String menuName) {
        harmanMainPage.clickInnovationsDropdown();
        Assertions.assertTrue(harmanMainPage.isDropdownDisplayed());
    }

    @When("I click on any option in the dropdown")
    public void i_click_on_any_option_in_the_dropdown() {
        // This step definition is generic because it represents a behavior that can vary. 
        // Actual implementation should ideally be data-driven or based on a specific scenario to click a known option.
    }

    @Then("it should navigate me to the corresponding section of the website")
    public void it_should_navigate_me_to_the_corresponding_section_of_the_website() {
        // This step should contain assertions to verify the current URL or page title, 
        // or any other relevant verification to ensure that the navigation was successful.
        // Implementation details depend on the application's response to clicking an option.
    }

    @When("I click outside of the dropdown menu")
    public void i_click_outside_of_the_dropdown_menu() {
        // This step might involve clicking on a specific element that represents "outside" the dropdown.
        // Since the PageObject does not provide a method to simulate this action directly, 
        // you might need to interact with another element on the page or use JavaScript execution as a workaround.
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        Assertions.assertFalse(harmanMainPage.isDropdownDisplayed());
    }

    @When("I click on the {string} dropdown menu again")
    public void i_click_on_the_dropdown_menu_again(String menuName) {
        harmanMainPage.clickInnovationsDropdown();
    }

    @Then("the dropdown should not close and remain displayed")
    public void the_dropdown_should_not_close_and_remain_displayed() {
        Assertions.assertTrue(harmanMainPage.isDropdownDisplayed());
    }
}
