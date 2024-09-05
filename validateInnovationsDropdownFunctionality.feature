Feature: Innovations Dropdown Functionality

  Scenario: Expand Innovations Dropdown
    Given the user is on the homepage
    When the user clicks on the Innovations dropdown
    Then the dropdown should expand showing all the sections

  Scenario: Navigate to a section from the Innovations Dropdown
    Given the Innovations dropdown is expanded
    When the user clicks on a section from the dropdown
    Then the user should be navigated to the selected section

  Scenario: Collapse Innovations Dropdown by clicking outside
    Given the Innovations dropdown is expanded
    When the user clicks outside the Innovations dropdown
    Then the dropdown should collapse

  Scenario: Collapse Innovations Dropdown by clicking another navigation item
    Given the Innovations dropdown is expanded
    When the user clicks on another navigation item
    Then the Innovations dropdown should collapse