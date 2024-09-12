Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User accesses the Solutions dropdown options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: User navigates to a section from the Solutions dropdown
    Given I am on the homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown dismisses when clicking outside
    Given I am on the homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown should close

  Scenario: Dropdown dismisses when navigating to an option
    Given I am on the homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Lifestyle" option
    Then the "Solutions" dropdown should close