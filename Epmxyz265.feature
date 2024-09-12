Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Background:
    Given I am on the homepage

  Scenario: Dropdown Visibility
    Given I have not interacted with the "Solutions" dropdown
    When I click on the "Solutions" dropdown menu
    Then the dropdown should display the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
  
  Scenario: Option Navigation - Automotive
    Given the "Solutions" dropdown is visible
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Option Navigation - Lifestyle
    Given the "Solutions" dropdown is visible
    When I click on the "Lifestyle" option
    Then I should be navigated to the "Lifestyle" section of the website
  
  Scenario: Dropdown Dismissal by clicking outside
    Given the "Solutions" dropdown is visible
    When I click outside of the dropdown
    Then the "Solutions" dropdown should close
  
  Scenario: Dropdown Dismissal by clicking another navigation item
    Given the "Solutions" dropdown is visible
    When I click on another item in the navigation bar
    Then the "Solutions" dropdown should close

  Scenario: Dropdown does not display incorrect options
    Given I have clicked on the "Solutions" dropdown menu
    When the dropdown is displayed
    Then it should not display any options other than "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"