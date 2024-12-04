public class InnovationsDropdownSteps {
  @Given("I am on the homepage")
  public void iAmOnTheHomepage() {
      // Code to navigate to the homepage
  }
  
  @When("I click on the {string} dropdown menu")
  public void iClickOnTheDropdownMenu(String menuName) {
      // Code to click on the specified dropdown menu
  }
  
  @Then("I should see the dropdown appear with options {string}")
  public void iShouldSeeTheDropdownWithOptions(String options) {
      // Code to verify the dropdown options
  }
  
  @When("I click on an option in the dropdown")
  public void iClickOnAnOptionInTheDropdown() {
      // Code to click on a dropdown option
  }
  
  @Then("I should be navigated to the corresponding section of the website")
  public void iShouldBeNavigatedToTheCorrespondingSection() {
      // Code to verify navigation to the correct section
  }
  
  @When("I click outside of the dropdown menu")
  public void iClickOutsideOfTheDropdown() {
      // Code to simulate clicking outside the dropdown
  }
  
  @Then("the dropdown should close")
  public void theDropdownShouldClose() {
      // Code to verify the dropdown has closed
  }
}