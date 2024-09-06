Feature: Validate Innovations Dropdown Functionality
  As a user
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Innovations dropdown reveals options on click
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigating to a section from the Innovations dropdown
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    And I click on "Automotive" from the dropdown options
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Innovations dropdown closes when clicking outside
    Given I have the "Innovations" dropdown menu open
    When I click outside of the dropdown area
    Then the "Innovations" dropdown should close

  Scenario: Innovations dropdown closes when selecting an option
    Given I have the "Innovations" dropdown menu open
    When I select any option from the dropdown
    Then the "Innovations" dropdown should close