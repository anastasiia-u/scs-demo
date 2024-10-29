Feature: Access Solutions Dropdown
As a user,
I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
So that I can easily navigate to relevant sections of the website.

Scenario: Dropdown Visibility
Given I am on the main navigation bar
When I click on the "Solutions" dropdown menu
Then I should see options "Automotive", "Lifestyle", "Consumer", "Professional", and "Digital Transformation Solutions"

Scenario: Option Navigation
Given the "Solutions" dropdown is visible
When I click on the "Automotive" option
Then I should be navigated to the "Automotive" section

Scenario: Dropdown Dismissal
Given the "Solutions" dropdown is visible
When I click outside the dropdown
Then the dropdown should close

Negative Scenario: Dropdown Not Visible
Given I am on the main navigation bar
When I do not click on the "Solutions" dropdown menu
Then the dropdown should not be visible