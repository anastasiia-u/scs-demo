Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User can view and access all options under the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And I can click on each option to navigate to the corresponding section

  Scenario: Dropdown is visible when clicked and dismisses appropriately
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then the dropdown should appear with all necessary options
    When I click outside the dropdown
    Then the dropdown should close

  Scenario: Navigation to a section from the dropdown works correctly
    Given I am on the homepage and the "Solutions" dropdown menu is visible
    When I click on the "Automotive" option from the dropdown
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown closes when an option is selected
    Given I am on the homepage and the "Solutions" dropdown menu is visible
    When I select any option from the dropdown
    Then the dropdown should close immediately after the selection

  Scenario: Dropdown does not close when clicking within the dropdown
    Given I am on the homepage and the "Solutions" dropdown menu is visible
    When I click within the dropdown area but not on an option
    Then the dropdown should remain open