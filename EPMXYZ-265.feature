Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User accesses the Solutions dropdown successfully
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: User navigates to a section from the Solutions dropdown
    Given I am on the homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be redirected to the Automotive section of the website

  Scenario: Solutions dropdown dismisses when clicking outside
    Given I am on the homepage and the "Solutions" dropdown menu is open
    When I click outside the "Solutions" dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Solutions dropdown dismisses when selecting an option
    Given I am on the homepage and the "Solutions" dropdown menu is open
    When I select any option from the "Solutions" dropdown
    Then the "Solutions" dropdown menu should close