package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;

public class SmokeTest {
    MainPage mainPage;

    public SmokeTest() {
        mainPage = new MainPage();
    }

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String string) {
        mainPage.open();
    }

    @When("I enter my zip code into the zip code field")
    public void i_enter_my_zip_code_into_the_zip_code_field() {
        mainPage.getZipOrSponsorCodeField().sendKeys("02114");
    }

    @And("I click the {string} button")
    public void i_click_the_button(String string) {
        mainPage.getFindADriveButton().click();
    }

    @Then("I should see a list of nearby donation locations")
    public void i_should_see_a_list_of_nearby_donation_locations() {
        Assertions.assertFalse(mainPage.getSearchResultsByDate().isEmpty());
    }

    @When("I click the {string} tab")
    public void i_click_the_tab(String string) {
        if(string.equals("Sort by Date")) {
            mainPage.getByDateButton().click();
        } else if(string.equals("Sort by Distance")) {
            mainPage.getByDistanceButton().click();
        }
    }

    @Then("the locations should be sorted by date")
    public void the_locations_should_be_sorted_by_date() {
        Assertions.assertFalse(mainPage.getSearchResultsByDate().isEmpty());
    }

    @Then("the locations should be sorted by distance")
    public void the_locations_should_be_sorted_by_distance() {
        Assertions.assertFalse(mainPage.getSearchResultsByDistance().isEmpty());
    }

    @When("I click the {string} button for a location")
    public void i_click_the_button_for_a_location(String string) {
        mainPage.getSeeTimesButton().click();
    }

    @Then("I should see available time slots for that location")
    public void i_should_see_available_time_slots_for_that_location() {
        Assertions.assertFalse(mainPage.getTimeSlots().isEmpty());
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        mainPage.getBloodLink().click();
    }

    @Then("I should see information about blood donations")
    public void i_should_see_information_about_blood_donations() {
        Assertions.assertEquals("The most common type of donation, during which approximately a pint of 'whole blood' is given. This type of blood donation usually takes about an hour. ", 
        mainPage.getBloodDescriptionText().getText());
    }

    @Then("I should be taken back to my previous search results")
    public void i_should_be_taken_back_to_my_previous_search_results() {
        Assertions.assertFalse(mainPage.getSearchResultsByDate().isEmpty());
    }

    @Then("Login and Password fields are displayed")
    public void login_and_password_fields_are_displayed() {
        Assertions.assertTrue(mainPage.getUsernameField().isDisplayed());
        Assertions.assertTrue(mainPage.getPasswordField().isDisplayed());
    }

    @When("I click the Change button")
    public void I_click_the_Change_button() {
        mainPage.getChangeButton().click();
    }

    @Then("I should see {string} title")
    public void i_should_see_title(String string) {
        Assertions.assertEquals(string, mainPage.getCreateMyAccountText().getText());
    }

    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
        Assertions.assertEquals("https://www.redcrossblood.org/", mainPage.getDriver().getCurrentUrl());
    }

    @When("I click the Sign In button")
    public void I_click_the_Sign_In_button() {
        mainPage.getSignInButton().click();
    }

    @When("I click the Home link at the bottom of the page")
    public void I_click_the_Home_link_at_the_bottom_of_the_page() {
        mainPage.getHomeButton().click();
    }

    @When("I click on I Need to Create an Account button")
    public void I_click_on_I_Need_to_Create_an_Account_button() {
        mainPage.getNeedToCreateAccountButton().click();
    }
}

    //   public class MainPage extends BasePage {
    
    //     private String url = "https://www.redcrossblood.org/give.html/find-drive";
    
    //     @FindBy(xpath = "//*[@id='zipcode']")
    //     private WebElement zipOrSponsorCodeField;
    
    //     @FindBy(xpath = "//button[@type='submit']")
    //     private WebElement findADriveButton;
    
    //     @FindBy(xpath = "//a[@data-aa-app-links='BY DATE']")
    //     private WebElement byDateButton;
    
    //     @FindBy(xpath = "//a[@data-aa-app-links='BY DISTANCE']")
    //     private WebElement byDistanceButton;
    
    //     @FindBy(xpath = "//div[@class='drive-result-block ng-star-inserted']")
    //     private List<WebElement> searchResultsByDate;
    
    //     @FindBy(xpath = "//div[@class='tab_content by-distance ng-star-inserted']")
    //     private List<WebElement> searchResultsByDistance;
    
    //     @FindBy(xpath = "(//button[@class='see-times'])[1]")
    //     private WebElement seeTimesButton;
    
    //     @FindBy(xpath = "//div[@class='current-donation-time']")
    //     private List<WebElement> timeSlots;
    
    //     @FindBy(xpath = "//a[@data-aa-app-donation-type-links='Blood']")
    //     private WebElement bloodLink;
    
    //     @FindBy(xpath = "//span[@style='text-align: left;']")
    //     private WebElement bloodDescriptionText;
    
    //     @FindBy(xpath = "//span[@style='text-align: left;']")
    //     private WebElement changeButton;
    
    //     @FindBy(xpath = "//a[@class='sign-in mobile']")
    //     private WebElement signInButton;
    
    //     @FindBy(xpath = "//input[@id='username']")
    //     private WebElement usernameField;
    
    //     @FindBy(xpath = "//input[@id='password']")
    //     private WebElement passwordField;
    
    //     @FindBy(xpath = "//a[@class='link-create ng-star-inserted']")
    //     private WebElement needToCreateAccountButton;
    
    //     @FindBy(xpath = "//header[@class='main-heading alt']")
    //     private WebElement createMyAccountText;
    
    //     @FindBy(xpath = "//a[@data-aa-app-footer-link='Home']")
    //     private WebElement homeButton;
    
    //     public void open() {
    //         getDriver().get(url);
    //     }
    
    //     public WebElement getZipOrSponsorCodeField() {
    //         return zipOrSponsorCodeField;
    //     }
    
    //     public WebElement getFindADriveButton() {
    //         return findADriveButton;
    //     }
    
    //     public WebElement getByDateButton() {
    //         return byDateButton;
    //     }
    
    //     public WebElement getByDistanceButton() {
    //         return byDistanceButton;
    //     }
    
    //     public List<WebElement> getSearchResultsByDate() {
    //         return searchResultsByDate;
    //     }
    
    //     public List<WebElement> getSearchResultsByDistance() {
    //         return searchResultsByDistance;
    //     }
    
    //     public WebElement getSeeTimesButton() {
    //         return seeTimesButton;
    //     }
    
    //     public List<WebElement> getTimeSlots() {
    //         return timeSlots;
    //     }
    
    //     public WebElement getBloodLink() {
    //         return bloodLink;
    //     }
    
    //     public WebElement getBloodDescriptionText() {
    //         return bloodDescriptionText;
    //     }
    
    //     public WebElement getChangeButton() {
    //         return changeButton;
    //     }
    
    //     public WebElement getSignInButton() {
    //         return signInButton;
    //     }
    
    //     public WebElement getUsernameField() {
    //         return usernameField;
    //     }
    
    //     public WebElement getPasswordField() {
    //         return passwordField;
    //     }
    
    //     public WebElement getNeedToCreateAccountButton() {
    //         return needToCreateAccountButton;
    //     }
    
    //     public WebElement getCreateMyAccountText() {
    //         return createMyAccountText;
    //     }
    
    //     public WebElement getHomeButton() {
    //         return homeButton;
    //     }  

//     Scenario: User finds a donation drive by zip code
//     Given I am on the "Find A Drive" page
//     When I enter my zip code into the zip code field
//     And I click the "Find A Drive" button
//     Then I should see a list of nearby donation locations

//   Scenario: User sorts donation locations by date
//     Given I have searched for donation locations
//     When I click the "Sort by Date" tab
//     Then the locations should be sorted by date

//   Scenario: User sorts donation locations by distance
//     Given I have searched for donation locations
//     When I click the "Sort by Distance" tab
//     Then the locations should be sorted by distance

//   Scenario: User views available donation times
//     Given I am viewing the list of donation locations
//     When I click the "See Times" button for a location
//     Then I should see available time slots for that location

//   Scenario: User clicks on the "Platelets" link to learn more
//     Given I am on the Blood Donation homepage
//     When I click on the "Blood" link
//     Then I should see information about blood donations

//   Scenario: User navigates back to the location list from available times
//     Given I am viewing available time slots for a location
//     When I click the "change" button
//     Then I should be taken back to my previous search results

//   Scenario: Successful sign in
//     Given I am on the Main page 
//     When I click on "Sign In" button
//     Then Login and Password fields are displayed

//   Scenario: Successful account creation
//     Given I am on the Main page
//     When I click on "I Need to Create an Account" button
//     Then I should see "Create My Account" title

//   Scenario: User navigates to the homepage from another page
//     Given I am on any page other than the homepage
//     When I click the "Home" link at the bottom of the page
//     Then I should be redirected to the homepage





    



