Feature: Validate Dropdown Functionality in Navigation Bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Scenario Outline: Dropdown menus open and display correct options
    Given I am on the homepage
    When I click on the "<NavigationItem>" item in the navigation bar
    Then the dropdown menu for "<NavigationItem>" should be displayed
    And it should contain options for "<ExpectedOptions>"

    Examples:
      | NavigationItem | ExpectedOptions                                      |
      | About Us       | Company Overview, Leadership, Our History, Awards    |
      | Careers        | Open Positions, Life at Company, Students & Grads    |
      | Investors      | Financials, Events & Presentations, Stock Information|
      | Partner with Us| Program Overview, How to Apply, FAQs                |
      | Media          | Press Releases, In the News, Media Kit               |

  Scenario: Dropdown closes when clicking outside
    Given I have opened a dropdown menu in the navigation bar
    When I click outside of the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown navigates to the correct page
    Given I am on the homepage
    When I select an option from any dropdown menu
    Then I should be navigated to the correct page associated with that option

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened a dropdown menu in the navigation bar
    When I click on another navigation item
    Then the previously opened dropdown menu should close
    And the dropdown menu for the newly clicked item should open