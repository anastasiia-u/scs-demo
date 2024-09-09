Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Background:
    Given I am on the homepage

  Scenario: User accesses all options under the "Solutions" dropdown
    When I click on the "Solutions" dropdown menu
    Then I should see the following options:
      | Option                       |
      | Automotive                   |
      | Lifestyle                    |
      | Consumer                     |
      | Professional                 |
      | Digital Transformation Solutions |
    And each option should be clickable and navigate to the correct section

  Scenario: Dropdown dismissal on clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown dismissal on clicking another navigation item
    Given I have opened the "Solutions" dropdown menu
    When I click on another item in the navigation bar
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown does not close when clicking an option
    Given I have opened the "Solutions" dropdown menu
    When I click on an option within the dropdown
    Then the "Solutions" dropdown menu should not close immediately

  Scenario: Dropdown does not appear when navigation bar is not visible
    Given the navigation bar is not visible on the screen
    When I attempt to click on the "Solutions" dropdown menu
    Then the "Solutions" dropdown menu should not appear