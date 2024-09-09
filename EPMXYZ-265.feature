Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Background:
    Given I am on the Homepage

  Scenario: Dropdown menu visibility
    When I click on the "Solutions" dropdown menu
    Then the dropdown should display options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigation to a dropdown option
    Given the "Solutions" dropdown menu is visible
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown menu dismissal by clicking outside
    Given the "Solutions" dropdown menu is visible
    When I click outside of the "Solutions" dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown menu dismissal by interacting with another navigation item
    Given the "Solutions" dropdown menu is visible
    When I click on another item in the navigation bar
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown menu does not display if not clicked (Negative Scenario)
    When I hover over the "Solutions" dropdown menu
    Then the dropdown should not display its options