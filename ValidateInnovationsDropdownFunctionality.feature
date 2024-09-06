Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Innovations dropdown menu is visible and functional
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And each option should be clickable
    And clicking on each option should navigate me to the correct page

  Scenario: Innovations dropdown menu dismisses correctly
    Given I have clicked on the "Innovations" dropdown menu and it is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Innovations dropdown menu dismisses when interacting with other navigation items
    Given I have clicked on the "Innovations" dropdown menu and it is open
    When I click on another navigation item
    Then the dropdown menu should close

Please ensure the website is properly loaded before executing the tests and that all navigation links are working as expected. Use these scenarios to validate the dropdown functionality thoroughly.