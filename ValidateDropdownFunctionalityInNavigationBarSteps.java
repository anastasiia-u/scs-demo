import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateDropdownFunctionalityInNavigationBarSteps {

    private WebDriver driver;
    private MainPage mainPage;

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @When("^I click on the 'About Us' item in the navigation bar$")
    public void iClickOnTheAboutUsItemInTheNavigationBar() {
        mainPage.clickAboutUs();
    }

    @Then("^the dropdown menu should display options correctly$")
    public void theDropdownMenuShouldDisplayOptionsCorrectly() {
        Assert.assertTrue(mainPage.isDropdownDisplayedCorrectly());
    }

    @When("^I click outside of the dropdown area$")
    public void iClickOutsideOfTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @Then("^the dropdown menu should close$")
    public void theDropdownMenuShouldClose() {
        Assert.assertFalse(mainPage.isDropdownDisplayed());
    }

    // Additional step definitions...
}