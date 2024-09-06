Feature: Innovations Dropdown Menu Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown reveals all options upon click
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigating to a section from the dropdown
    Given I have clicked on the "Innovations" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown dismisses upon clicking outside
    Given the "Innovations" dropdown is open
    When I click outside of the dropdown area
    Then the "Innovations" dropdown should close

  Scenario: Dropdown dismisses upon selecting an option
    Given the "Innovations" dropdown is open
    When I select any option from the dropdown
    Then the "Innovations" dropdown should close

  Scenario: Dropdown does not open when disabled (Negative)
    Given the "Innovations" dropdown is disabled
    When I try to click on the "Innovations" dropdown menu
    Then the dropdown should not open

  Scenario: Navigating to a wrong section from the dropdown (Negative)
    Given I have clicked on the "Innovations" dropdown menu
    When I click on the "Lifestyle" option
    But I am navigated to the Automotive section
    Then an error should be displayed or corrected navigation should occur