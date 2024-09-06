package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;

public class InnovationsDropdownSteps {
    MainPage mainPage = new MainPage();

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        mainPage.openHomepage();
    }

    @Given("I am on the homepage and the \"Innovations\" dropdown is visible")
    public void iAmOnTheHomepageAndInnovationsDropdownIsVisible() throws NoSuchMethodException {
        mainPage.openHomepage();
        if (!mainPage.isInnovationsDropdownVisible()) {
            throw new NoSuchMethodException("isInnovationsDropdownVisible method is missing in MainPage");
        }
    }

    @When("I click on the \"Innovations\" dropdown menu in the main navigation bar")
    public void iClickOnTheInnovationsDropdownMenu() throws NoSuchMethodException {
        if (!mainPage.clickInnovationsDropdown()) {
            throw new NoSuchMethodException("clickInnovationsDropdown method is missing in MainPage");
        }
    }

    @When("I click on the \"(.*)\" option in the dropdown")
    public void iClickOnOptionInTheDropdown(String optionName) throws NoSuchMethodException {
        if (!mainPage.clickDropdownOption(optionName)) {
            throw a NoSuchMethodException("clickDropdownOption method is missing in MainPage");
        }
    }

    @When("I click outside of the \"Innovations\" dropdown area")
    public void iClickOutsideOfTheInnovationsDropdownArea() throws NoSuchMethodException {
        if (!mainPage.clickOutsideInnovationsDropdown()) {
            throw a NoSuchMethodException("clickOutsideInnovationsDropdown method is missing in MainPage");
        }
    }

    @When("I click on another item in the main navigation bar")
    public void iClickOnAnotherItemInTheMainNavigationBar() throws NoSuchMethodException {
        if (!mainPage.clickAnotherNavItem()) {
            throw a NoSuchMethodException("clickAnotherNavItem method is missing in MainPage");
        }
    }

    @Then("I should see the dropdown options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldSeeTheDropdownOptions() throws NoSuchMethodException {
        String[] expectedOptions = {"Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions"};
        Assertions.assertArrayEquals(expectedOptions, mainPage.getInnovationsDropdownOptions());
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() throws NoSuchMethodException {
        Assertions.assertTrue(mainPage.isAtAutomotiveSection(), "Not navigated to Automotive section");
    }

    @Then("the \"Innovations\" dropdown should close")
    public void theInnovationsDropdownShouldClose() throws NoSuchMethodException {
        Assertions.assertFalse(mainPage.isInnovationsDropdownVisible(), "Innovations dropdown did not close");
    }
}
