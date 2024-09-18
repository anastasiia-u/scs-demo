Feature: Validate Solutions dropdown functionality

  Scenario: Verify dropdown visibility
    Given I am on the main page
    When I click on the "Solutions" dropdown
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", "Digital Transformation Solutions"

  Scenario: Verify option navigation
    Given I am on the main page
    When I click on the "Solutions" dropdown
    And I select "Automotive"
    Then I should be navigated to the "Automotive" section

  Scenario: Verify dropdown dismissal
    Given the "Solutions" dropdown is open
    When I click outside the dropdown
    Then the dropdown should close