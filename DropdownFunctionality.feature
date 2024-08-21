Feature: Dropdown Functionality in Navigation Bar

  Scenario: User hovers over the navigation bar dropdown
    Given the user is on the homepage
    When the user hovers over the navigation bar dropdown
    Then the dropdown menu should be displayed

  Scenario: User clicks an item in the navigation bar dropdown
    Given the user is on the homepage
    When the user clicks an item in the navigation bar dropdown
    Then the corresponding page should be displayed