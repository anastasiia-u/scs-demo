Feature: Validate dropdown functionality in the navigation bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Background:
    Given I am on the homepage

  Scenario Outline: User accesses dropdown options from the navigation bar
    When I click on the "<DropdownItem>" item in the navigation bar
    Then the "<DropdownItem>" dropdown menu should be displayed with correct options
    And each option should lead to the corresponding page when clicked

    Examples:
      | DropdownItem     |
      | About Us         |
      | Careers          |
      | Investors        |
      | Partner with Us  |
      | Media            |

  Scenario: Clicking outside the dropdown closes it
    Given I have opened any dropdown menu
    When I click outside of the dropdown area
    Then the dropdown should close

  Scenario: Clicking another navigation item closes the current dropdown
    Given I have opened the "About Us" dropdown menu
    When I click on another navigation item with a dropdown
    Then the "About Us" dropdown should close
    And the new dropdown should be displayed with correct options

  Scenario: Non-dropdown navigation items do not have dropdown functionality
    When I click on a navigation item without a dropdown
    Then no dropdown menu should be displayed