Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Successful navigation to a section from the Innovations dropdown
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    When I click on the "Automotive" option in the dropdown
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown closes when clicking outside
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click outside of the dropdown menu
    Then the "Innovations" dropdown menu should close

  Scenario: Dropdown remains open when interacting with dropdown items
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I hover over the options within the dropdown
    Then the "Innovations" dropdown menu should remain open

  Scenario: Navigation to a non-existent section from the Innovations dropdown
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    And I click on an option not listed in the dropdown
    Then I should see a "Page not found" error message