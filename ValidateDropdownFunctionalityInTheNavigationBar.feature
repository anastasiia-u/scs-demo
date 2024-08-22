Feature: Validate Dropdown Functionality in the Navigation Bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

Scenario: Successful dropdown functionality validation for 'About Us'
    Given I am on the homepage
    When I click on the 'About Us' menu item
    Then the dropdown menu should display options for 'About Us'
    And each option should be clickable and lead to the correct page

Scenario: Successful dropdown functionality validation for 'Careers'
    Given I am on the homepage
    When I click on the 'Careers' menu item
    Then the dropdown menu should display options for 'Careers'
    And each option should be clickable and lead to the correct page

Scenario: Dropdown closes on clicking outside
    Given I have opened a dropdown menu
    When I click outside of the dropdown area
    Then the dropdown should close

Scenario: Dropdown closes on clicking another navigation item
    Given I have opened the 'About Us' dropdown menu
    When I click on the 'Careers' menu item
    Then the 'About Us' dropdown should close and the 'Careers' dropdown should open

Scenario: Unsuccessful dropdown functionality when XPath is incorrect (Negative Scenario)
    Given I am on the homepage with incorrect XPath for dropdown menus
    When I try to interact with any menu item
    Then no dropdown should be displayed