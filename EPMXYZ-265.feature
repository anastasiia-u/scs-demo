Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown Visibility - Ensure dropdown appears with all options
    Given I am on the main page of the website
    When I click on the "Solutions" dropdown menu
    Then I should see the dropdown menu with the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Navigate to "Automotive" section
    Given I am on the main page of the website
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Automotive" option from the dropdown
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown Dismissal - Clicking outside closes the dropdown
    Given I am on the main page of the website
    And the "Solutions" dropdown menu is open
    When I click outside of the "Solutions" dropdown menu
    Then the "Solutions" dropdown menu should close

  Scenario: Invalid Option Navigation - Clicking an undefined option
    Given I am on the main page of the website
    And I have clicked on the "Solutions" dropdown menu
    When I click on an option not listed in the dropdown
    Then I should receive an error message or no action should be taken

  Scenario: Dropdown Dismissal - Navigating to another section closes the dropdown
    Given I am on the main page of the website
    And the "Solutions" dropdown menu is open
    When I navigate to another section of the website without selecting any dropdown option
    Then the "Solutions" dropdown menu should close