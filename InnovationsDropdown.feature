Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Innovations dropdown visibility
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown appear with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Innovations dropdown option navigation
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click on an option in the dropdown
    Then I should be navigated to the corresponding section of the website

  Scenario: Innovations dropdown dismissal
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click outside of the dropdown menu
    Then the dropdown should close