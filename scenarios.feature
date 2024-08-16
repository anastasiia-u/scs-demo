Feature: Validate dropdown functionality in the navigation bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Scenario Outline: User accesses dropdown options from the main navigation
    Given I am on the main page with the navigation bar
    When I click on the '<MainNavItem>' item in the navigation bar
    Then the dropdown menu should display the '<ExpectedOptions>'

    Examples:
      | MainNavItem | ExpectedOptions                                      |
      | About Us    | Company Overview, Our Leadership, Our History, Awards |
      | Careers     | Find a Job, Life at Company, Students & Graduates    |
      | Investors   | Financials, Events & Presentations, Stock Information |
      | Partner with Us | Become a Partner, Partner Directory             |
      | Media       | Press Releases, Media Library, Contact Media Team   |

  Scenario: Clicking outside the dropdown should close it
    Given I have opened a dropdown menu in the navigation bar
    When I click outside of the dropdown area
    Then the dropdown should close

  Scenario: Clicking another navigation item closes the current dropdown and opens the new one
    Given I have opened a dropdown menu in the navigation bar
    When I click on a different navigation item with a dropdown
    Then the current dropdown should close
    And the new dropdown menu should open

  Scenario: Clicking an option in the dropdown navigates to the correct page
    Given I am viewing a dropdown menu in the navigation bar
    When I click on an option within the dropdown
    Then I should be navigated to the option's corresponding page

  Scenario: Dropdown options should be clickable
    Given I am viewing a dropdown menu in the navigation bar
    Then each option within the dropdown should be clickable

  Scenario: Dropdown does not close when clicking another option within it
    Given I am viewing a dropdown menu in the navigation bar
    When I click on an option within the dropdown
    Then the dropdown should not close

