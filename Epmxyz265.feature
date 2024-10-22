### Feature: Solutions Dropdown Functionality
As a user,
I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
So that I can easily navigate to relevant sections of the website.

#### Scenario: Dropdown Visibility
**Given** I am on the main navigation bar
**When** I click on the "Solutions" dropdown menu
**Then** I should see options such as "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

#### Scenario: Option Navigation
**Given** the "Solutions" dropdown menu is open
**When** I click on the "Automotive" option
**Then** I should be navigated to the "Automotive" section of the website

#### Scenario: Dropdown Dismissal
**Given** the "Solutions" dropdown menu is open
**When** I click outside the dropdown menu
**Then** the dropdown should close

#### Scenario: Invalid Option Selection
**Given** the "Solutions" dropdown menu is open
**When** I attempt to click on a non-existent option
**Then** no navigation should occur and the dropdown should remain open

These scenarios cover both positive and negative test cases, ensuring comprehensive testing of the dropdown functionality.