Feature: Validate Solutions dropdown functionality

  Scenario: Dropdown Visibility
    Given I am on the main page
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions"

  Scenario: Option Navigation
    Given I am on the main page
    When I click on each option in the "Solutions" dropdown menu
    Then I should be navigated to the correct section

  Scenario: Dropdown Dismissal
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown
    Then the dropdown should close