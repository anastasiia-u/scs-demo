Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown menu appears with all necessary options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu in the main navigation bar
    Then the dropdown should display with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Dropdown option navigation
    Given the "Innovations" dropdown menu is displayed
    When I click on any option within the dropdown
    Then I should be navigated to the corresponding section of the website

  Scenario: Dropdown dismissal
    Given the "Innovations" dropdown menu is displayed
    When I click outside of the dropdown area
    Then the dropdown should close and the page view should return to normal