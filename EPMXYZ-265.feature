Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown displays all options when clicked
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to a section via dropdown option
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown closes when clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown
    Then the dropdown should close

  Scenario: Dropdown does not open when clicking disabled menu
    Given I am on the main page
    And the "Solutions" dropdown is disabled
    When I click on the "Solutions" dropdown menu
    Then the dropdown should not open