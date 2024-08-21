Feature: Validate Dropdown Functionality in Navigation Bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Scenario: User accesses dropdown options successfully
    Given I am on the homepage
    When I click on the 'About Us' item in the navigation bar
    Then the dropdown menu should display options correctly
    And each option should be clickable and lead to the correct page

    Examples:
      | NavigationItem | ExpectedPageURL           |
      | About Us       | https://example.com/about |
      | Careers        | https://example.com/career|
      | Investors      | https://example.com/invest|

  Scenario: Dropdown closes when user clicks outside
    Given I have opened a dropdown menu in the navigation bar
    When I click outside of the dropdown area
    Then the dropdown menu should close

  Scenario Outline: Each navigation item reveals associated options
    Given I am on the homepage
    When I click on '<NavigationItem>' in the navigation bar
    Then the dropdown menu should display options correctly

    Examples:
      | NavigationItem |
      | About Us       |
      | Careers        |
      | Investors      |
      | Partner with Us|
      | Media          |

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened a dropdown menu in the navigation bar
    When I click on another item in the navigation bar
    Then the dropdown menu should close and the new item's dropdown should display if applicable