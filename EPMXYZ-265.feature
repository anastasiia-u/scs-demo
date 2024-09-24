Feature: Access Solutions Dropdown
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown displays all options
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to a section via dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown closes when clicking outside
    Given the "Solutions" dropdown is open
    When I click outside the dropdown
    Then the dropdown should close

  Scenario: Dropdown does not open when clicking disabled
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown while it is disabled
    Then the dropdown should not open