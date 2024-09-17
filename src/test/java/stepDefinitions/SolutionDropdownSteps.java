import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionDropdownSteps {

    private Example examplePage = new Example();

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        examplePage.navigateToHomepage();
    }

    @When("I click on the {string} dropdown menu")
    public void iClickOnTheDropdownMenu(String dropdownName) {
        examplePage.clickDropdownByName(dropdownName);
    }

    @Then("the dropdown should appear with options {string}")
    public void theDropdownShouldAppearWithOptions(String options) {
        assertTrue(examplePage.isDropdownVisibleWithOptions(options.split(", ")));
    }

    @Given("I am on the homepage and the {string} dropdown is visible")
    public void iAmOnTheHomepageAndTheDropdownIsVisible(String dropdownName) {
        examplePage.navigateToHomepage();
        examplePage.ensureDropdownIsVisible(dropdownName);
    }

    @When("I click on the {string} option in the dropdown")
    public void iClickOnTheOptionInTheDropdown(String optionName) {
        examplePage.clickDropdownOption(optionName);
    }

    @Then("I should be navigated to the {string} section of the website")
    public void iShouldBeNavigatedToTheSectionOfTheWebsite(String sectionName) {
        assertTrue(examplePage.isOnSection(sectionName));
    }

    @When("I click outside of the {string} dropdown area")
    public void iClickOutsideOfTheDropdownArea(String dropdownName) {
        examplePage.clickOutsideDropdownArea(dropdownName);
    }

    @Then("the dropdown should close appropriately")
    public void theDropdownShouldCloseAppropriately() {
        assertFalse(examplePage.isDropdownVisible());
    }
}