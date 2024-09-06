Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Innovations dropdown visibility
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Innovations dropdown option navigation
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    And I click on an option "Automotive"
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Innovations dropdown dismissal by clicking outside
    Given I have opened the "Innovations" dropdown menu
    When I click outside of the dropdown area
    Then the "Innovations" dropdown menu should close

  Scenario: Innovations dropdown dismissal by selecting another navigation item
    Given I have opened the "Innovations" dropdown menu
    When I click on another item in the navigation bar
    Then the "Innovations" dropdown menu should close