Feature: Access all options under the 'Solutions' dropdown menu
  As a user
  I want to access all options under the 'Solutions' dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown appears with all necessary options when clicked
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    Then I should see the options 'Automotive', 'Lifestyle', 'Consumer', 'Professional', and 'Digital Transformation Solutions'

  Scenario: Dropdown does not appear when clicked
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    Then the dropdown menu should not appear

  Scenario: Each dropdown option is clickable and navigates correctly
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Automotive' option
    Then I should be navigated to the 'Automotive' section

  Scenario: Dropdown option is not clickable
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Automotive' option
    Then I should not be navigated to the 'Automotive' section

  Scenario: Dropdown closes appropriately when interacting outside of it
    Given I have the 'Solutions' dropdown menu open
    When I click outside of the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown does not close when interacting outside of it
    Given I have the 'Solutions' dropdown menu open
    When I click outside of the dropdown menu
    Then the dropdown menu should not close

  Scenario: Dropdown closes appropriately when interacting with other navigation items
    Given I have the 'Solutions' dropdown menu open
    When I click on another navigation item
    Then the dropdown menu should close

  Scenario: Dropdown does not close when interacting with other navigation items
    Given I have the 'Solutions' dropdown menu open
    When I click on another navigation item
    Then the dropdown menu should not close