import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.MainPage;
import java.util.Arrays;
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

    @When("I click on the \"Solutions\" dropdown menu")
    public void iClickOnTheSolutionsDropdownMenu() {
        mainPage.clickSolutionsDropdown();
    }

    @When("I click outside the dropdown")
    public void iClickOutsideTheDropdownArea() {
        mainPage.clickOutsideDropdown();
    }

    @When("I click within the dropdown area but not on an option")
    public void iClickWithinTheDropdownButNotOnAnOption() {
        // This step assumes the implementation detail that clicking within the dropdown but not on an option does not perform any navigation or close the dropdown.
        // The actual implementation may require interacting with a specific element within the dropdown that is not one of the options.
        mainPage.clickWithinDropdownArea();
    }

    @When("I select any option from the dropdown")
    public void iSelectAnyOptionFromTheDropdown() {
        // This step definition assumes that we can simulate selecting any option without specifying which one, for the test's purpose.
        // In a real scenario, we might need to specify which option to select for more precise control.
        mainPage.selectAnyOptionFromSolutionsDropdown();
    }

    @When("I click on the \"Automotive\" option from the dropdown")
    public void iClickOnTheAutomotiveOption() {
        mainPage.selectOptionFromSolutionsDropdown("Automotive");
    }

    @Then("I should see the options \"Automotive\", \"Lifestyle\", \"Consumer\", \"Professional\", and \"Digital Transformation Solutions\"")
    public void iShouldSeeTheFollowingOptionsInDropdown() {
        List<String> expectedOptions = Arrays.asList("Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions");
        List<WebElement> optionsElements = mainPage.getSolutionsDropdownOptions();
        List<String> actualOptions = optionsElements.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(expectedOptions.stream().allMatch(actualOptions::contains), "All expected options should be present in the Solutions dropdown.");
    }

    @Then("the dropdown should appear with all necessary options")
    @And("the dropdown should remain open")
    public void theDropdownShouldRemainOpen() {
        Assertions.assertTrue(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be open.");
    }

    @Then("the dropdown should close")
    @And("the dropdown should close immediately after the selection")
    public void theDropdownShouldClose() {
        Assertions.assertFalse(mainPage.isSolutionsDropdownOpen(), "Solutions dropdown should be closed.");
    }

    @Then("I should be navigated to the Automotive section of the website")
    public void iShouldBeNavigatedToTheAutomotiveSection() {
        Assertions.assertTrue(mainPage.isOnAutomotiveSection(), "User should be navigated to the Automotive section.");
    }
}