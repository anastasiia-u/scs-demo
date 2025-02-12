Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown visibility when clicked
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to Automotive section
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the Automotive section

  Scenario: Navigate to Lifestyle section
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    And I select the "Lifestyle" option
    Then I should be navigated to the Lifestyle section

  Scenario: Dropdown dismissal when clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown dismissal when selecting another navigation item
    Given I have opened the "Solutions" dropdown menu
    When I click on another navigation item
    Then the dropdown menu should close