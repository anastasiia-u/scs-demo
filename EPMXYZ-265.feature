Feature: Validate Innovations Dropdown Functionality

As a user,
I want to access all options under the "Innovations" dropdown menu in the main navigation bar,
So that I can easily navigate to relevant sections of the website.

Scenario: Dropdown Visibility - Positive Test Case
Given I am on the homepage
When I click on the "Innovations" dropdown menu
Then I should see the dropdown options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions" appear

Scenario: Option Navigation - Positive Test Case
Given I am viewing the "Innovations" dropdown menu
When I click on the "Automotive" option
Then I should be navigated to the "Automotive" section of the website

Scenario: Dropdown Dismissal - Positive Test Case
Given I have clicked on the "Innovations" dropdown menu and it is open
When I click outside of the dropdown menu
Then the "Innovations" dropdown menu should close

Scenario: Dropdown Visibility - Negative Test Case
Given I am on the homepage
When I click on the "Innovations" dropdown menu
Then I should not see any unrelated options appear in the dropdown

Scenario: Option Navigation - Negative Test Case
Given I am viewing the "Innovations" dropdown menu
When I click on the "Automotive" option
Then I should not be navigated to an unrelated section of the website