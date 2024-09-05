Feature: Validate Innovations Dropdown

  Scenario: Verify the innovations dropdown is present and clickable
    Given I am on the Harman Home Page
    When I look for the innovations dropdown
    Then the dropdown should be present and clickable

  Scenario: Verify the dropdown options are correct
    Given I am on the Harman Home Page
    When I click on the innovations dropdown
    Then I should see the correct dropdown options