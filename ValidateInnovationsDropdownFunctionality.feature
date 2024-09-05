Feature: Validate Innovations Dropdown Functionality

  As a user
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Background:
    Given I am on the homepage

  Scenario Outline: Dropdown Visibility
    When I click on the "Innovations" dropdown menu
    Then the dropdown should display with the following options
      | option              |
      | Automotive          |
      | Lifestyle           |
      | Consumer            |
      | Professional        |
      | Digital Transformation Solutions |

  Scenario Outline: Option Navigation
    When I click on the "<option>" from the "Innovations" dropdown menu
    Then I should be navigated to the "<page>" related to the option

    Examples:
      | option              | page                        |
      | Automotive          | Automotive section page     |
      | Lifestyle           | Lifestyle section page      |
      | Consumer            | Consumer section page       |
      | Professional        | Professional section page   |
      | Digital Transformation Solutions | Digital Transformation section page |

  Scenario: Dropdown Dismissal
    When I click on the "Innovations" dropdown menu
    And I click outside of the dropdown area
    Then the dropdown should close

    When I click on the "Innovations" dropdown menu
    And I click on another navigation item
    Then the dropdown should close