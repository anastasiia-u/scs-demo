Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown Visibility
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation
    Given the "Solutions" dropdown menu is open
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown Dismissal by Clicking Outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown Dismissal by Navigating to Another Menu
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown menu should close

  Scenario: Invalid Option Selection
    Given the "Solutions" dropdown menu is open
    When I attempt to select an option that does not exist
    Then I should see an error message indicating the option is not available