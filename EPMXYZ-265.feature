Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown visibility
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option navigation
    Given the "Solutions" dropdown menu is open
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown dismissal by clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown
    Then the dropdown should close

  Scenario: Dropdown dismissal by interacting with other navigation items
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown should close

  Scenario: Invalid option selection
    Given the "Solutions" dropdown menu is open
    When I attempt to select a non-existent option "InvalidOption"
    Then I should see an error message or no action should occur
