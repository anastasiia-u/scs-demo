Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown visibility and option navigation
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"
    And each option should be clickable
    And clicking on each option navigates to the correct section

  Scenario: Dropdown dismissal
    Given I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown closes when interacting with other navigation items
    Given I have opened the "Solutions" dropdown menu
    When I click on another navigation item
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown menu does not display all options (Negative Test Case)
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should not see any missing options from "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigating to a wrong section (Negative Test Case)
    Given I am on the homepage
    And I click on the "Solutions" dropdown menu
    When I click on any option
    Then I should not be navigated to a wrong section