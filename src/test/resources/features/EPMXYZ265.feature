Feature: Validate Innovations Dropdown Functionality
  As a user,
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown Visibility - Innovations dropdown appears with all options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the dropdown with options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: Option Navigation - Navigating through dropdown options
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    And I click on one of the options like "Automotive"
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown Dismissal - Dropdown closes when interacting outside
    Given I have opened the "Innovations" dropdown menu
    When I click anywhere outside of the "Innovations" dropdown menu
    Then the "Innovations" dropdown should close

Please ensure to replace the homepage URL and section URLs with the actual URLs during the test automation script development. The scenarios cover the acceptance criteria provided in the Jira story EPMXYZ-265.