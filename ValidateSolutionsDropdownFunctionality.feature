Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown menu appears with all necessary options
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown
    Then I should see the dropdown menu appear with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Dropdown option navigation
    Given I am viewing the "Solutions" dropdown menu
    When I click on the option "Automotive"
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown dismissal by clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside of the dropdown menu
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown dismissal by clicking another navigation item
    Given the "Solutions" dropdown menu is open
    When I click on another item in the main navigation bar
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown does not appear when not clicked (Negative Scenario)
    Given I am on the main navigation bar
    When I do not click on the "Solutions" dropdown
    Then I should not see the dropdown menu