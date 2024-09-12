Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Solutions dropdown visibility and option navigation
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And When I click on each of the dropdown options
    Then I should be navigated to the respective section of the website

  Scenario: Solutions dropdown dismissal by clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click anywhere outside the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Solutions dropdown dismissal by interacting with other navigation items
    Given I have opened the "Solutions" dropdown menu
    When I click on any other navigation item on the bar
    Then the "Solutions" dropdown menu should close

  Scenario: Navigation to a non-existent option in the Solutions dropdown (Negative Test)
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I try to select a non-existent option "Space Exploration"
    Then I should not be navigated away from the homepage
    And I should see an error message or no action should be taken