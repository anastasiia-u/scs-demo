Feature: Validate Solutions Dropdown Functionality

  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Solutions dropdown displays all options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigation to a Solution option
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dismissing the Solutions dropdown
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click on another item in the navigation bar
    Then the "Solutions" dropdown should close

  Negative Scenario: Solutions dropdown does not display all options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should not see any missing options from "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"