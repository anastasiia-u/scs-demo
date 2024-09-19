package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pageobjects.MainPage;
import org.junit.jupiter.api.Assertions;

public class TestEPMXYZ265 {
    MainPage mainPage;

    public TestEPMXYZ265() {
        mainPage = new MainPage();
    }

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String pageName) {
        mainPage.open(pageName);
    }

    @When("I enter {string} into the code field")
    public void i_enter_code_into_the_code_field(String code) {
        mainPage.getCodeField().sendKeys(code);
    }

    @And("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        mainPage.clickButton(buttonName);
    }

    @Then("I should see a list of nearby locations")
    public void i_should_see_a_list_of_nearby_locations() {
        Assertions.assertFalse(mainPage.getSearchResults().isEmpty(), "Search results should not be empty");
    }
}
