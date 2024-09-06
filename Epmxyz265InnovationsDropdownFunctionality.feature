Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Innovations dropdown menu appears with all necessary options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown menu with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to an option from the Innovations dropdown
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    And I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown closes when clicking outside
    Given I have opened the "Innovations" dropdown menu
    When I click outside the dropdown area
    Then the "Innovations" dropdown menu should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened the "Innovations" dropdown menu
    When I click on another navigation item
    Then the "Innovations" dropdown menu should close