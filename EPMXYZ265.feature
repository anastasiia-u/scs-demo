Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Solutions dropdown displays all necessary options
    Given I am on the Home page
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigating to a section from the Solutions dropdown
    Given I am on the Home page
    And the "Solutions" dropdown menu is displayed
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Solutions dropdown closes when clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Solutions dropdown closes when selecting an option
    Given I have opened the "Solutions" dropdown menu
    When I select any option from the dropdown
    Then the "Solutions" dropdown menu should close

  Scenario: Solutions dropdown does not display an option (Negative Test)
    Given I am on the Home page
    When I click on the "Solutions" dropdown menu
    Then I should not see the option "Unrelated Option"