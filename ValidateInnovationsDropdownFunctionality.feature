Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown displays all options when clicked
    Given I am on the main page
    When I click on the "Innovations" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: User navigates to a section from the dropdown
    Given I am on the main page
    When I click on the "Innovations" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown dismisses when clicking outside
    Given I have clicked on the "Innovations" dropdown menu and the options are displayed
    When I click anywhere outside the dropdown area
    Then the "Innovations" dropdown menu should close