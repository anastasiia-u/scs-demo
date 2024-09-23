Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown appears with all necessary options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigate to a section via dropdown option
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown closes when clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened the "Solutions" dropdown menu
    When I click on the "Home" navigation item
    Then the dropdown menu should close
    And I should be navigated to the homepage

  Scenario: Dropdown does not appear when clicking on a disabled menu
    Given I am on the homepage
    And the "Solutions" dropdown menu is disabled
    When I click on the "Solutions" dropdown menu
    Then the dropdown menu should not appear