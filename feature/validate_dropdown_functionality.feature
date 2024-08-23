Feature: Validate Dropdown Functionality in Navigation Bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Scenario: User successfully accesses options from a dropdown in the navigation bar
    Given I am on the homepage
    When I click on the 'About Us' option in the navigation bar
    Then the 'About Us' dropdown should display with correct options
    And each option should be clickable and lead to the correct page

  Scenario: User clicks outside the dropdown to close it
    Given I have opened the 'Careers' dropdown in the navigation bar
    When I click anywhere outside the dropdown area
    Then the 'Careers' dropdown should close

  Scenario: Dropdown closes when clicking on another navigation item
    Given I have opened the 'Investors' dropdown in the navigation bar
    When I click on the 'Partner with Us' option in the navigation bar
    Then the 'Investors' dropdown should close
    And the 'Partner with Us' dropdown should display with correct options