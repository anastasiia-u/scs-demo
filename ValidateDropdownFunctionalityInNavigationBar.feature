Feature: Validate Dropdown Functionality in Navigation Bar

  Scenario: User sees correct dropdown options
    Given the user is on the homepage
    When the user clicks on the navigation bar dropdown
    Then the dropdown displays options "Option 1", "Option 2", "Option 3"