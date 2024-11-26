Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown Visibility
    Given I am on the main navigation bar
    When I click on the "Solutions" dropdown menu
    Then I should see options such as "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Option Navigation
    Given the "Solutions" dropdown menu is visible
    When I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown Dismissal
    Given the "Solutions" dropdown menu is visible
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Invalid Option Selection
    Given the "Solutions" dropdown menu is visible
    When I attempt to click on a non-existent option "InvalidOption"
    Then I should not be navigated to any section
    And I should see an error message "Option not available"