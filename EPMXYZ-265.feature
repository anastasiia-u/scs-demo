Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown menu visibility and functionality
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And each option should be clickable and navigate to the correct section

  Scenario: Dropdown menu dismissal
    Given I have clicked on the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close