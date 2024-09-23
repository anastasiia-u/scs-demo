Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Display Solutions dropdown options
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to a section via Solutions dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dismiss Solutions dropdown
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the "Solutions" dropdown menu should close

  Scenario: Invalid option in Solutions dropdown
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    And I select an option that does not exist
    Then I should see an error message indicating the option is invalid