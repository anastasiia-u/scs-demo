Feature: Validate Innovations Dropdown Functionality

  Scenario: Dropdown displays all necessary options upon click
    Given I am on the homepage
    When I click on the Innovations dropdown
    Then I should see all necessary options

  Scenario: Each dropdown option navigates correctly
    Given I am on the homepage
    When I click on an option in the Innovations dropdown
    Then I should be navigated to the corresponding page

  Scenario: Dropdown closes when interacting outside of it
    Given the Innovations dropdown is open
    When I click outside of the dropdown
    Then the dropdown should close

  Scenario: Dropdown closes when interacting with other navigation items
    Given the Innovations dropdown is open
    When I click on another navigation item
    Then the dropdown should close