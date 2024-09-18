Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown displays all options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigation to option under Solutions
    Given I am on the homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown dismissal
    Given I am on the homepage
    And the "Solutions" dropdown menu is displayed
    When I click outside of the dropdown menu
    Then the dropdown menu should close