Feature: Validate Solutions Dropdown Functionality
  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: User accesses all options in the Solutions dropdown
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the following options:
      | Option                       |
      | Automotive                   |
      | Lifestyle                    |
      | Consumer                     |
      | Professional                 |
      | Digital Transformation Solutions |

  Scenario: User navigates to a section from the Solutions dropdown
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the Automotive section of the website

  Scenario: Solutions dropdown dismisses when clicking outside
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click outside the "Solutions" dropdown area
    Then the "Solutions" dropdown should close

  Scenario: Solutions dropdown dismisses when clicking another navigation item
    Given I am on the homepage
    And I have opened the "Solutions" dropdown menu
    When I click on another navigation item
    Then the "Solutions" dropdown should close