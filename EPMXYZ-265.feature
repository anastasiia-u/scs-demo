Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User accesses the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: User navigates to an option from the Solutions dropdown
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown closes when user interacts outside of it
    Given I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: User attempts to navigate with a malfunctioning dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should not see any options if the dropdown is malfunctioning
    And An error message "Failed to load dropdown options" should be displayed