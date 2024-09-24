package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.MainPage;
import pageobjects.SolutionsPage;
import org.junit.jupiter.api.Assertions;

public class TestSolutionsDropdown {
    MainPage mainPage;
    SolutionsPage solutionsPage;

    public TestSolutionsDropdown() {
        mainPage = new MainPage();
        solutionsPage = new SolutionsPage();
    }

    @Given("I am on the main navigation bar")
    public void i_am_on_the_main_navigation_bar() {
        mainPage.navigateToMainBar();
    }

    @When("I click on the {string} dropdown menu")
    public void i_click_on_the_dropdown_menu(String dropdownMenu) {
        mainPage.getDropdownMenu(dropdownMenu).click();
    }

    @Then("I should see options such as {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_options(String automotive, String lifestyle, String consumer, String professional, String digitalTransformation) {
        Assertions.assertTrue(mainPage.isOptionVisible(automotive));
        Assertions.assertTrue(mainPage.isOptionVisible(lifestyle));
        Assertions.assertTrue(mainPage.isOptionVisible(consumer));
        Assertions.assertTrue(mainPage.isOptionVisible(professional));
        Assertions.assertTrue(mainPage.isOptionVisible(digitalTransformation));
    }

    @Given("the {string} dropdown menu is visible")
    public void the_dropdown_menu_is_visible(String dropdownMenu) {
        Assertions.assertTrue(mainPage.isDropdownVisible(dropdownMenu));
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        mainPage.getOption(option).click();
    }

    @Then("I should be navigated to the {string} section of the website")
    public void i_should_be_navigated_to_the_section_of_the_website(String section) {
        Assertions.assertEquals(section, solutionsPage.getCurrentSection());
    }

    @When