package stepdefinitions;

import pageobjects.InnovationsDropdownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class InnovationsDropdownSteps {

    WebDriver driver = new ChromeDriver();
    InnovationsDropdownPage innovationsDropdownPage = new InnovationsDropdownPage(driver);

    @Given("^User is on HARMAN homepage$")
    public void userIsOnHarmanHomepage() {
        driver.get("https://www.harman.com");
    }

    @When("^User clicks on Innovations dropdown$")
    public void userClicksOnInnovationsDropdown() {
        innovationsDropdownPage.openDropdown();
    }

    @Then("^The dropdown options are displayed$")
    public void theDropdownOptionsAreDisplayed() {
        assert innovationsDropdownPage.isDropdownVisible();
    }

    @When("^User selects "([^"]*)" from the dropdown$")
    public void userSelectsOptionFromTheDropdown(String option) {
        innovationsDropdownPage.selectOption(option);
    }

    @Then("^User is navigated to the corresponding section$")
    public void userIsNavigatedToTheCorrespondingSection() {
        // Add verification logic for navigation
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}