Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Successful visibility and access of Solutions dropdown options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then the dropdown should display options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And I should be able to click on each option to navigate to the respective section

  Scenario: Dropdown closes when clicking outside the dropdown area
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown closes when interacting with other navigation items
    Given the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown does not display when not clicked
    Given I am on the homepage
    When I do not interact with the "Solutions" dropdown menu
    Then the dropdown menu should not be visible

Scenario: Unsuccessful navigation due to faulty links in Solutions dropdown
    Given I am on the homepage
    And I click on the "Solutions" dropdown menu
    When I click on a dropdown option with a broken link
    Then I should receive an error message or be redirected to an error page