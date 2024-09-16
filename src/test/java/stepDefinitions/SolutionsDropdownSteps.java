import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import {{Example}}.pages.HomePage;

public class SolutionsDropdownSteps {

    HomePage homePage = new HomePage();

    @Given("I am on the Home page")
    public void i_am_on_the_home_page() {
        homePage.navigateToHomePage();
        // Navigates to the Home Page. Assuming navigateToHomePage() method exists within HomePage class.
    }

    @Given("I have opened the \"Solutions\" dropdown menu")
    public void i_have_opened_the_solutions_dropdown_menu() {
        homePage.openSolutionsDropdown();
        // Opens the Solutions dropdown. Assumes openSolutionsDropdown() method exists.
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void i_click_on_the_solutions_dropdown_menu() {
        homePage.clickOnSolutionsDropdown();
        // Clicks on the Solutions dropdown. Assumes clickOnSolutionsDropdown() method exists.
    }

    @When("I click on the \"{string}\" option")
    public void i_click_on_the_option(String option) {
        homePage.selectOptionFromSolutionsDropdown(option);
        // Selects an option from the Solutions dropdown. Parameterized to allow any option to be selected.
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        homePage.clickOutsideDropdown();
        // Simulates a click outside the dropdown area to test if it closes as expected.
    }

    @When("I select any option from the dropdown")
    public void i_select_any_option_from_the_dropdown() {
        homePage.selectAnyOptionFromDropdown();
        // Selects any option from the dropdown to test closure of the dropdown.
    }

    @Then("I should see the options \"Automotive,\" \"Lifestyle,\" \"Consumer,\" \"Professional,\" and \"Digital Transformation Solutions\"")
    public void i_should_see_the_options() {
        Assert.assertTrue(homePage.areOptionsVisible("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions"));
        // Asserts that the specified options are visible. Assumes areOptionsVisible() method exists and takes variable number of arguments.
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section() {
        Assert.assertTrue(homePage.isAtAutomotiveSection());
        // Asserts that the current page is the Automotive section. Assumes isAtAutomotiveSection() method exists.
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void the_solutions_dropdown_menu_should_close() {
        Assert.assertFalse(homePage.isSolutionsDropdownOpen());
        // Asserts that the Solutions dropdown menu is closed. Assumes isSolutionsDropdownOpen() method exists and returns false when the dropdown is closed.
    }

    @Then("I should not see the option \"Unrelated Option\"")
    public void i_should_not_see_the_option_unrelated_option() {
        Assert.assertFalse(homePage.isOptionVisible("Unrelated Option"));
        // Asserts that the "Unrelated Option" is not visible. Assumes isOptionVisible() method exists.
    }
}