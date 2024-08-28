Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown Visibility - Dropdown appears with all options when clicked
    Given I am on the main page
    When I click on the "Innovations" dropdown menu in the main navigation bar
    Then the dropdown should display options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Each dropdown option navigates correctly
    Given I am on the main page
    And I have clicked on the "Innovations" dropdown menu in the main navigation bar
    When I click on any option in the dropdown
    Then it should navigate me to the corresponding section of the website

  Scenario: Dropdown Dismissal - Dropdown closes when interacting outside
    Given I am on the main page
    And the "Innovations" dropdown menu is displayed
    When I click outside of the dropdown menu
    Then the dropdown should close

  Scenario: Negative Test - Dropdown does not close when clicking on it
    Given I am on the main page
    And the "Innovations" dropdown menu is displayed
    When I click on the "Innovations" dropdown menu again
    Then the dropdown should not close and remain displayed