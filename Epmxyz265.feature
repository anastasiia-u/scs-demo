Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Accessing options under the Solutions dropdown
    Given I am on the main page of the website
    When I click on the "Solutions" dropdown menu
    Then the dropdown should display options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"
    And each option should be clickable

  Scenario: Navigating to a section from the Solutions dropdown
    Given I have opened the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dismissing the Solutions dropdown
    Given the "Solutions" dropdown menu is open
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Fail to display Solutions dropdown options
    Given I am on the main page of the website
    When I click on the "Solutions" dropdown menu
    Then the dropdown should not display any options
    And a message "Failed to load options, please try again later" should be shown