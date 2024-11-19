Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Display all options in the Solutions dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to Automotive section
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the Automotive section

  Scenario: Dropdown closes when clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown menu should close