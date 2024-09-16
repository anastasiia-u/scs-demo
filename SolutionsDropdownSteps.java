import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SolutionsDropdownSteps {

    private Example examplePage;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        examplePage.navigateToHomePage();
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void i_click_on_the_solutions_dropdown_menu() {
        examplePage.clickSolutionsDropdown();
    }

    @Then("I should see the following options:")
    public void i_should_see_the_following_options(List<String> options) {
        Assert.assertTrue("Options not found", examplePage.verifyOptions(options));
    }

    @When("I click on the \"Automotive\" option")
    public void i_click_on_the_automotive_option() {
        examplePage.selectOption("Automotive");
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void i_should_be_navigated_to_the_automotive_section_of_the_website() {
        Assert.assertTrue("Not navigated to Automotive section", examplePage.isOnAutomotiveSection());
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        examplePage.clickOutsideDropdown();
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void the_solutions_dropdown_menu_should_close() {
        Assert.assertFalse("Dropdown did not close", examplePage.isSolutionsDropdownOpen());
    }

    @When("I click on another item in the navigation bar")
    public void i_click_on_another_item_in_the_navigation_bar() {
        examplePage.clickAnotherNavItem();
    }

}