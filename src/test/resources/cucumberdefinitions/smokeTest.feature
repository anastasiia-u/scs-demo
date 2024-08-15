Feature: Find a Blood Donation Drive
  As a potential blood donor
  I want to enter my zip code and find a drive
  So that I can locate the closest blood donation location

  Scenario: User finds a donation drive by zip code
    Given I am on the "Find A Drive" page
    When I enter my zip code into the zip code field
    And I click the "Find A Drive" button
    Then I should see a list of nearby donation locations

   Scenario: User sorts donation locations by date
     When I click the "Sort by Date" tab
     Then the locations should be sorted by date

   Scenario: User sorts donation locations by distance
     When I click the "Sort by Distance" tab
     Then the locations should be sorted by distance

   Scenario: User views available donation times
     When I click the "See Times" button for a location
     Then I should see available time slots for that location

   Scenario: User clicks on the "Blood" link to learn more
     When I click on the "Blood" link
     Then I should see information about blood donations

   Scenario: User navigates back to the location list from available times
     When I click the Change button
     Then I should be taken back to my previous search results

   Scenario: Successful sign in
     When I click the Sign In button
     Then Login and Password fields are displayed

   Scenario: Successful account creation
     When I click on I Need to Create an Account button
     Then I should see "Create My Account" title

   Scenario: User navigates to the homepage from another page
     When I click the Home link at the bottom of the page
     Then I should be redirected to the homepage

     