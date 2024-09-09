Feature: Validate Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Background:
    Given I am on the homepage

  Scenario: Dropdown visibility and option navigation
    When I click on the "Solutions" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"
    When I click on "Automotive" from the dropdown
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown option navigation to Lifestyle section
    When I click on the "Solutions" dropdown menu
    And I click on "Lifestyle" from the dropdown
    Then I should be navigated to the Lifestyle section of the website

  Scenario: Dropdown dismissal by clicking outside
    When I click on the "Solutions" dropdown menu
    And I click outside the dropdown area
    Then the "Solutions" dropdown should close

  Scenario: Dropdown dismissal by interacting with other navigation items
    When I click on the "Solutions" dropdown menu
    And I click on another navigation item "About Us"
    Then the "Solutions" dropdown should close
    And I should be navigated to the "About Us" page

  Scenario: Dropdown does not dismiss when clicking its options
    When I click on the "Solutions" dropdown menu
    And I click on "Digital Transformation Solutions" from the dropdown
    Then the "Solutions" dropdown should not close automatically
    And I should be navigated to the Digital Transformation Solutions section of the website

  Scenario: Incomplete dropdown options
    When I click on the "Solutions" dropdown menu
    Then I should not see any options missing from "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Incorrect navigation from options
    When I click on the "Solutions" dropdown menu
    And I click on "Professional" from the dropdown
    Then I should not be navigated to an incorrect section of the website