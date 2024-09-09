Feature: Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown displays all options when clicked
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the following options:
      | Option                       |
      | Automotive                   |
      | Lifestyle                    |
      | Consumer                     |
      | Professional                 |
      | Digital Transformation Solutions |

  Scenario: Navigating to an option from the dropdown
    Given I am on the homepage
    And I have clicked on the "Innovations" dropdown menu
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown dismisses when clicking outside
    Given I am on the homepage
    And I have clicked on the "Innovations" dropdown menu
    When I click outside of the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown does not display options when not clicked (Negative Test)
    Given I am on the homepage
    When I hover over the "Innovations" dropdown menu but do not click
    Then the dropdown menu should not display any options