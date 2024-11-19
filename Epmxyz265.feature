Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown visibility when clicked
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    Then I should see the options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Navigate to Automotive section
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I select the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown dismissal when clicking outside
    Given the "Solutions" dropdown menu is open
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown dismissal when selecting another navigation item
    Given the "Solutions" dropdown menu is open
    When I click on the "Home" navigation item
    Then the dropdown menu should close

  Scenario: Invalid option selection
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu
    And I select an option that does not exist
    Then I should see an error message indicating the option is invalid