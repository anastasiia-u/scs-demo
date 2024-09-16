Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User accesses options under the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the following options:
      | Option                        |
      | Automotive                    |
      | Lifestyle                     |
      | Consumer                      |
      | Professional                  |
      | Digital Transformation Solutions |

  Scenario: User navigates to a section from the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Dropdown dismisses when clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside of the dropdown area
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown dismisses when clicking on another navigation item
    Given I have opened the "Solutions" dropdown menu
    When I click on another item in the navigation bar
    Then the "Solutions" dropdown menu should close