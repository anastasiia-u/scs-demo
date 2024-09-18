Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Display all options in the Solutions dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to a section via Solutions dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dismiss Solutions dropdown by clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dismiss Solutions dropdown by selecting another navigation item
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown menu should close

  Scenario: Attempt to access Solutions dropdown with no options available
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see a message "No options available" if no options are present