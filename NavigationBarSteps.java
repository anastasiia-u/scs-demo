package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class NavigationBarSteps {
    MainPage mainPage = new MainPage();

    @Given(\"I am on the main navigation bar\")
    public void iAmOnTheMainNavigationBar() {
        // Assuming 'openMainNavigationBar()' opens the website and focuses on the navigation bar.
        mainPage.openMainNavigationBar();
    }

    @When(\"I click on the \\\"([^\"]*)\\\" dropdown menu\")
    public void iClickOnTheDropdownMenu(String menuName) {
        mainPage.clickOnDropdownMenu(menuName);
    }

    @Then(\"I should see options \\\"([^\"]*)\\\"\")
    public void iShouldSeeOptions(String options) {
        String[] expectedOptions = options.split(\