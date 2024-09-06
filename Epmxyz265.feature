Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown Visibility - Dropdown appears with all options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Navigate through options
    Given I am on the homepage
    And I have opened the "Innovations" dropdown menu
    When I click on any option in the dropdown
    Then I should be navigated to the corresponding section of the website

  Scenario: Dropdown Dismissal - Dropdown closes appropriately
    Given I have opened the "Innovations" dropdown menu
    When I click outside of the dropdown menu
    Then the dropdown should close

  Scenario: Dropdown Dismissal - Dropdown closes by interacting with other navigation items
    Given I have opened the "Innovations" dropdown menu
    When I click on any other navigation item
    Then the dropdown should close

Please note that these scenarios were generated based on the user story and acceptance criteria provided in the JIRA task EPMXYZ-265. Ensure that these scenarios are implemented and tested in your BDD framework to validate the functionality of the Innovations dropdown menu as described.