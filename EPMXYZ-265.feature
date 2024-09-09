Feature: Validate Innovations Dropdown Functionality
  As a user
  I want to access all options under the "Innovations" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: User accesses options under the Innovations dropdown
    Given I am on the homepage
    When I click on the "Innovations" dropdown menu
    Then I should see the options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

  Scenario: User navigates to a section from the Innovations dropdown
    Given I am on the homepage and I have opened the "Innovations" dropdown menu
    When I click on an option "Automotive"
    Then I should be navigated to the "Automotive" section of the website

  Scenario: Dropdown closes when interacting outside of it
    Given I have opened the "Innovations" dropdown menu
    When I click outside of the dropdown area
    Then the "Innovations" dropdown should close