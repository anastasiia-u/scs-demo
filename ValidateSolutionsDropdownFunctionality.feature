Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User successfully accesses options under the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    And I should be able to click on each option to navigate to the respective section

  Scenario: Dropdown dismisses when clicking outside
    Given I am on the homepage and the "Solutions" dropdown menu is open
    When I click outside of the "Solutions" dropdown menu
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown navigates correctly when an option is clicked
    Given I am on the homepage and the "Solutions" dropdown menu is open
    When I click on the "Automotive" option in the dropdown
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown does not appear when disabled in settings
    Given I am on the homepage and the "Solutions" dropdown has been disabled in settings
    When I click on the "Solutions" dropdown menu
    Then the "Solutions" dropdown menu should not open
    And I should see a message indicating that the dropdown is disabled