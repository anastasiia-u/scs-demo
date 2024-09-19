Feature: Accessing options under the 'Solutions' dropdown menu
  As a user
  I want to access all options under the 'Solutions' dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown visibility
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    Then I should see options 'Automotive', 'Lifestyle', 'Consumer', 'Professional', and 'Digital Transformation Solutions'

  Scenario: Option navigation
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Automotive' option
    Then I should be navigated to the 'Automotive' section

  Scenario: Option navigation
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Lifestyle' option
    Then I should be navigated to the 'Lifestyle' section

  Scenario: Option navigation
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Consumer' option
    Then I should be navigated to the 'Consumer' section

  Scenario: Option navigation
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Professional' option
    Then I should be navigated to the 'Professional' section

  Scenario: Option navigation
    Given I am on the main navigation bar
    When I click on the 'Solutions' dropdown menu
    And I click on the 'Digital Transformation Solutions' option
    Then I should be navigated to the 'Digital Transformation Solutions' section

  Scenario: Dropdown dismissal
    Given I have clicked on the 'Solutions' dropdown menu
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown dismissal
    Given I have clicked on the 'Solutions' dropdown menu
    When I click on another navigation item
    Then the dropdown menu should close