Feature: Validate dropdown functionality in the navigation bar
    As an automation engineer
    I want to validate the dropdown functionality in the main navigation bar
    So that users can access all available options correctly

    Scenario Outline: User can access dropdown menus for main navigation items
      Given I am on the homepage
      When I click on the <NavigationItem> in the main navigation bar
      Then the dropdown menu should display the <ExpectedOptions>
      And each option should be clickable and lead to the correct page

      Examples:
        | NavigationItem | ExpectedOptions                                 |
        | About Us       | Company Overview, Our Team, Contact Us         |
        | Careers        | Open Positions, Life at Company, How to Apply  |
        | Investors      | Financials, Governance, Investor News          |
        | Partner with Us| Partner Programs, Application                  |
        | Media          | Press Releases, Media Kit, Contact             |

    Scenario: Closing the dropdown by clicking outside
      Given I have opened a dropdown menu in the main navigation bar
      When I click outside of the dropdown menu
      Then the dropdown should close

    Scenario: Closing the dropdown by clicking on another navigation item
      Given I have opened a dropdown menu in the main navigation bar
      When I click on another item in the main navigation bar
      Then the dropdown should close and the new item's dropdown (if present) should open