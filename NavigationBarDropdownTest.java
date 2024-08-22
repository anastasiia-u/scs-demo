import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class NavigationBarDropdownTest {
    WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);

    @Given("^the user is on the homepage$")
    public void user_is_on_homepage() {
        driver.get("http://example.com");
    }

    @When("^the user clicks on the navigation bar dropdown$")
    public void user_clicks_navbar_dropdown() {
        mainPage.clickOnNavbarDropdown();
    }

    @Then("^the dropdown displays options \"([^\"]*)\"$")
    public void dropdown_displays_options(String options) {
        // Implementation to validate dropdown options
    }
}