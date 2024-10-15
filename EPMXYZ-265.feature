Feature: Access Solutions Dropdown Menu

  As a user,
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar,
  So that I can easily navigate to relevant sections of the website.

  Scenario: Dropdown appears with all necessary options when clicked
  Given I am on the main navigation bar
  When I click on the "Solutions" dropdown menu
  Then I should see the following options:
    | Option                        |
    | Automotive                    |
    | Lifestyle                     |
    | Consumer                      |
    | Professional                  |
    | Digital Transformation Solutions |

  Scenario: Each dropdown option is clickable and navigates correctly
  Given I am on the main navigation bar
  When I click on the "Solutions" dropdown menu
  And I click on the "Automotive" option
  Then I should be navigated to the "Automotive" section

  Scenario: Dropdown closes when interacting outside of it
  Given I have opened the "Solutions" dropdown menu
  When I click outside the dropdown menu
  Then the "Solutions" dropdown menu should close

  Scenario: Dropdown does not appear when clicking outside the menu
  Given I am on the main navigation bar
  When I click outside the "Solutions" dropdown menu
  Then the "Solutions" dropdown menu should not appear
