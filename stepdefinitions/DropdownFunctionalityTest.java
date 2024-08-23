package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.NavigationBarPage;

public class DropdownFunctionalityTest {

    NavigationBarPage navigationBarPage;

    public DropdownFunctionalityTest() {
        navigationBarPage = new NavigationBarPage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        navigationBarPage.openHomepage();
    }
    
    @Given("I have opened the {string} dropdown in the navigation bar")
    public void i_have_opened_the_dropdown_in_the_navigation_bar(String dropdownName) {
        navigationBarPage.openDropdown(dropdownName);
    }

    @When("I click on the {string} option in the navigation bar")
    public void i_click_on_the_option_in_the_navigation_bar(String optionName) {
        navigationBarPage.clickNavigationBarOption(optionName);
    }

    @When("I click anywhere outside the dropdown area")
    public void i_click_anywhere_outside_the_dropdown_area() {
        navigationBarPage.clickOutsideDropdownArea();
    }

    @Then("the {string} dropdown should display with correct options")
    public void the_dropdown_should_display_with_correct_options(String dropdownName) {
        Assertions.assertTrue(navigationBarPage.isDropdownDisplayedWithCorrectOptions(dropdownName),
                String.format("The dropdown '%s' did not display with correct options", dropdownName));
    }

    @Then("each option should be clickable and lead to the correct page")
    public void each_option_should_be_clickable_and_lead_to_the_correct_page() {
        Assertions.assertTrue(navigationBarPage.areDropdownOptionsClickableAndLeadToCorrectPage(),
                "Not all options in the dropdown are clickable or lead to the correct page");
    }
    
    @Then("the {string} dropdown should close")
    public void the_dropdown_should_close(String dropdownName) {
        Assertions.assertFalse(navigationBarPage.isDropdownDisplayed(dropdownName),
                String.format("The dropdown '%s' did not close as expected", dropdownName));
    }
}