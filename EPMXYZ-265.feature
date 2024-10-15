Feature: Solutions Dropdown Functionality
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown displays all options when clicked
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the following options:
      | Option                      |
      | Automotive                  |
      | Lifestyle                   |
      | Consumer                    |
      | Professional                |
      | Digital Transformation      |

  Scenario: Navigate to a section via dropdown option
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown closes when clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside the dropdown
    Then the "Solutions" dropdown menu should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened the "Solutions" dropdown menu
    When I click on the "Home" navigation item
    Then the "Solutions" dropdown menu should close
    And I should be navigated to the homepage