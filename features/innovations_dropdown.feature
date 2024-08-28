Feature: Validate Innovations Dropdown Functionality
Scenario: Dropdown Visibility
Given I am on the homepage
When I click on the 'Innovations' dropdown menu
Then the dropdown should display options 'Automotive', 'Lifestyle', 'Consumer', 'Professional', and 'Digital Transformation Solutions'

Scenario: Option Navigation
Given I am on the homepage and the 'Innovations' dropdown is visible
When I click on 'Automotive' option from the dropdown
Then I should be navigated to the Automotive section of the website

Scenario: Dropdown Dismissal
Given I am on the homepage and the 'Innovations' dropdown is visible
When I click outside of the 'Innovations' dropdown area
Then the 'Innovations' dropdown should close