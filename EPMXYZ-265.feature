Feature: Access Solutions Dropdown
As a user,
I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
So that I can easily navigate to relevant sections of the website.

Scenario: Dropdown Visibility
Given I am on the main navigation bar
When I click on the "Solutions" dropdown
Then I should see options such as "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

Scenario: Option Navigation
Given the "Solutions" dropdown is visible
When I click on the "Automotive" option
Then I should be navigated to the "Automotive" section of the website

Scenario: Dropdown Dismissal
Given the "Solutions" dropdown is visible
When I click outside the dropdown
Then the dropdown should close

Scenario: Invalid Option Selection
Given the "Solutions" dropdown is visible
When I attempt to select a non-existent option
Then I should see an error message indicating the option is not available