Feature: Validate Innovations Dropdown Functionality
  As a user
  I want to select different options from the Innovations dropdown
  So that I can navigate to different Innovation sections

  Scenario: User selects an option from the Innovations dropdown
    Given I am on the Home Page
    When I click on the Innovations dropdown
    And I select an option from the dropdown
    Then I am taken to the corresponding Innovations page