Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Display Solutions dropdown options
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to Automotive section
    Given the "Solutions" dropdown menu is open
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section

  Scenario: Close Solutions dropdown by clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown
    Then the dropdown should close

  Scenario: Close Solutions dropdown by selecting another navigation item
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown should close

  Scenario: Attempt to access Solutions dropdown without clicking
    Given I am on the main navigation bar
    When I do not click on the "Solutions" dropdown menu
    Then the dropdown should not be visible