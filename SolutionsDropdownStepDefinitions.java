import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;

public class SolutionsDropdownStepDefinitions {
    MainPage mainPage;

    public SolutionsDropdownStepDefinitions() {
        mainPage = new MainPage();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomePage();
    }

    @Given("I have opened the \"Solutions\" dropdown menu")
    public void iHaveOpenedTheSolutionsDropdown() {
        mainPage.clickSolutionsDropdown();
    }

    @Given("the navigation bar is not visible on the screen")
    public void theNavigationBarIsNotVisibleOnTheScreen() {
        Assertions.assertFalse(mainPage.isNavigationBarVisible(), "Navigation bar should not be visible on the screen.");
    }

    @When("I click on the \"Solutions\" dropdown menu")
    public void iClickOnTheSolutionsDropdownMenu() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click outside of the dropdown area")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click on another item in the navigation bar")
    public void iClickOnAnotherNavigationItem() {
        mainPage.clickAnotherNavItem();
    }

    @When("I click on an option within the dropdown")
    public void iClickOnAnOptionWithinTheDropdown() {
        mainPage.clickAnOptionInSolutionsDropdown();
    }

    @When("I attempt to click on the \"Solutions\" dropdown menu")
    public void iAttemptToClickOnTheSolutionsDropdownMenu() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownClickable(), "Solutions dropdown should not be clickable if the navigation bar is not visible.");
    }

    @Then("I should see the following options:")
    public void iShouldSeeTheFollowingOptions(List<String> expectedOptions) {
        List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
    }

    @Then("the \"Solutions\" dropdown menu should close")
    public void theSolutionsDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("the \"Solutions\" dropdown menu should not close immediately")
    public void theSolutionsDropdownMenuShouldNotCloseImmediately() {
        Assertions.assertTrue(mainPage.isSolutionsDropdownStillOpenAfterClickingAnOption(), "Solutions dropdown should remain open after clicking an option within the dropdown.");
    }

    @Then("the \"Solutions\" dropdown menu should not appear")
    public void theSolutionsDropdownMenuShouldNotAppear() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownVisible(), "Solutions dropdown should not appear if the navigation bar is not visible.");
    }

    @And("each option should be clickable and navigate to the correct section")
    public void eachOptionShouldBeClickableAndNavigateToTheCorrectSection() {
        Assertions.assertTrue(mainPage.areAllOptionsClickableAndNavigatingCorrectly(), "All options should be clickable and navigate to the correct section.");
    }
}