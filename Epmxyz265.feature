Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Accessing the Solutions dropdown options
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Navigating through the Solutions dropdown options
    Given I am on the homepage and the "Solutions" dropdown menu is open
    When I click on the "Automotive" option
    Then I should be redirected to the Automotive section of the website

  Scenario: Dropdown closes when interacting outside
    Given the "Solutions" dropdown menu is open
    When I click outside of the "Solutions" dropdown menu
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown closes when selecting an option
    Given the "Solutions" dropdown menu is open
    When I select any option within the "Solutions" dropdown
    Then the "Solutions" dropdown menu should close

  Scenario: Unable to access the Solutions dropdown options when not displayed
    Given I am on the homepage
    But the "Solutions" dropdown menu is not visible
    When I try to click on the "Solutions" dropdown menu
    Then I should not see any dropdown options
