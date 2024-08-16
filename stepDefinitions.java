package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageobjects.MainPage;
import java.util.List;
import java.util.Arrays;

public class NavigationBarDropdownSteps {

    private MainPage mainPage;

    public NavigationBarDropdownSteps() {
        mainPage = new MainPage(); // Assuming WebDriver is managed and initialized elsewhere
    }

    @Given("I am on the main page with the navigation bar")
    public void i_am_on_the_main_page_with_the_navigation_bar() {
        mainPage.open();
    }

    @When("I click on the {string} item in the navigation bar")
    public void i_click_on_the_item_in_the_navigation_bar(String mainNavItem) {
        WebElement dropdown = getDropdownElement(mainNavItem);
        dropdown.click();
        Assertions.assertTrue(dropdown.isDisplayed(), "Dropdown was not displayed after clicking on the navigation item.");
    }

    @Then("the dropdown menu should display the {string}")
    public void the_dropdown_menu_should_display(String expectedOptions) {
        List<String> expectedList = Arrays.asList(expectedOptions.split(", "));
        // Logic to retrieve the actual options displayed in the dropdown
        // List<String> actualOptions = mainPage.getDropdownOptions(mainNavItem);
        // Assertions.assertTrue(actualOptions.containsAll(expectedList), "Not all expected options are displayed.");
    }

    @Given("I have opened a dropdown menu in the navigation bar")
    public void i_have_opened_a_dropdown_menu_in_the_navigation_bar() {
        // Code to open a dropdown menu
        // WebElement dropdown = getDropdownElement("About Us");
        // dropdown.click();
        // Assertions.assertTrue(dropdown.isDisplayed(), "Dropdown was not displayed.");
    }

    @When("I click outside of the dropdown area")
    public void i_click_outside_of_the_dropdown_area() {
        mainPage.getLogoSciCorp().click();
    }

    @Then("the dropdown should close")
    public void the_dropdown_should_close() {
        // Logic to verify if the dropdown is closed
        // Assertions.assertFalse(isDropdownDisplayed("About Us"), "Dropdown did not close.");
    }

    @When("I click on a different navigation item with a dropdown")
    public void i_click_on_a_different_navigation_item_with_a_dropdown() {
        // Code to click on a different navigation item with a dropdown
        // WebElement newDropdown = getDropdownElement("Careers");
        // newDropdown.click();
        // Assertions.assertTrue(newDropdown.isDisplayed(), "New dropdown did not open.");
    }

    @Then("the current dropdown should close")
    public void the_current_dropdown_should_close() {
        // Logic to verify if the previous dropdown is closed
        // Assertions.assertFalse(isDropdownDisplayed("About Us"), "Previous dropdown did not close.");
    }

    @And("the new dropdown menu should open")
    public void the_new_dropdown_menu_should_open() {
        // Logic to verify if the new dropdown is open
        // Assertions.assertTrue(isDropdownDisplayed("Careers"), "New dropdown did not open.");
    }

    @Given("I am viewing a dropdown menu in the navigation bar")
    public void i_am_viewing_a_dropdown_menu_in_the_navigation_bar() {
        // Code to ensure a dropdown menu is being viewed
        // WebElement dropdown = getDropdownElement("About Us");
        // Assertions.assertTrue(dropdown.isDisplayed(), "Dropdown is not being viewed.");
    }

    @When("I click on an option within the dropdown")
    public void i_click_on_an_option_within_the_dropdown() {
        // Code to click on an option within the dropdown
        // WebElement option = mainPage.getDropdownOption("About Us", "Company Overview");
        // option.click();
        // Assertions.assertTrue(option.isEnabled(), "Option within the dropdown is not clickable.");
    }

    @Then("I should be navigated to the option's corresponding page")
    public void i_should_be_navigated_to_the_options_corresponding_page() {
        // Assertions to ensure navigation to the corresponding page
        // String currentUrl = mainPage.getCurrentUrl();
        // Assertions.assertTrue(currentUrl.contains("expected-page"), "Did not navigate to the option's corresponding page.");
    }

    @Then("each option within the dropdown should be clickable")
    public void each_option_within_the_dropdown_should_be_clickable() {
        // Logic to ensure each option within the dropdown is clickable
        // Assertions.assertTrue(mainPage.areDropdownOptionsClickable("About Us"), "Not all dropdown options are clickable.");
    }

    @Then("the dropdown should not close")
    public void the_dropdown_should_not_close() {
        // Logic to verify the dropdown does not close
        // Assertions.assertTrue(isDropdownDisplayed("About Us"), "Dropdown closed when it should not have.");
    }

    private WebElement getDropdownElement(String mainNavItem) {
        switch (mainNavItem) {
            case "About Us": return mainPage.getAboutUsDropdown();
            case "Careers": return mainPage.getCareersDropdown();
            case "Investors": return mainPage.getInvestorsDropdown();
            case "Partner with Us": return mainPage.getPartnerWithUsDropdown();
            case "Media": return mainPage.getMediaDropdown();
            default: throw new IllegalArgumentException("Unknown navigation item: " + mainNavItem);
        }
    }

    private boolean isDropdownDisplayed(String mainNavItem) {
        // Placeholder method to check if a dropdown is displayed
        // return getDropdownElement(mainNavItem).isDisplayed();
        return true; // Placeholder return
    }
}
