Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown appears with all necessary options
    Given I am on the main page of the website
    When I click on the "Solutions" dropdown menu in the main navigation bar
    Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Each dropdown option is clickable and navigates correctly
    Given I am on the main page of the website
    When I click on each option in the "Solutions" dropdown menu
    Then I should be navigated to the corresponding section of the website

  Scenario: Dropdown closes when interacting outside of it
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown closes when interacting with other navigation items
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the dropdown menu should close