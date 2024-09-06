Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown Visibility - Ensure dropdown appears with necessary options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Clickable options and correct navigation
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click on the "Automotive" option in the dropdown
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown Dismissal - Dropdown closes appropriately
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click outside the "Innovations" dropdown menu
    Then the "Innovations" dropdown menu should close

  Scenario: Dropdown Dismissal - Dropdown closes when interacting with other navigation items
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click on another navigation item
    Then the "Innovations" dropdown menu should close