Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Successful display of the Solutions dropdown
    Given I am on the Homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the dropdown options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigation to a Solution section from the dropdown
    Given I am on the Homepage
    And I have clicked on the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dismissal of the Solutions dropdown by clicking outside
    Given I am on the Homepage
    And the "Solutions" dropdown menu is open
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown closes when another menu item is clicked
    Given I am on the Homepage
    And the "Solutions" dropdown menu is open
    When I click on another navigation item
    Then the "Solutions" dropdown menu should close

  Scenario: Failure to display dropdown options upon click
    Given I am on the Homepage
    When I click on the "Solutions" dropdown menu
    Then no options should be visible