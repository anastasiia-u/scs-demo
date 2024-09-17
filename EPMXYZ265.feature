Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown Visibility - Dropdown appears with all options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then the dropdown should appear with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Dropdown options are clickable and navigate correctly
    Given I am on the homepage and the "Solutions" dropdown is visible
    When I click on the "Automotive" option in the dropdown
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown Dismissal - Dropdown closes when interacting outside of it
    Given I am on the homepage and the "Solutions" dropdown is visible
    When I click outside of the "Solutions" dropdown area
    Then the dropdown should close appropriately