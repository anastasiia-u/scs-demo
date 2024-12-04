Feature: Validate dropdown functionality in the navigation bar

  Background:
    Given I am on the homepage

  Scenario Outline: User clicks on main navigation item with a dropdown
    When I click on the "<navigation_item>" in the main navigation bar
    Then the dropdown for "<navigation_item>" should be visible
    And it should contain the following options:
      | option |
      <options>

    Examples:
      | navigation_item | options                         |
      | About Us        | Company Overview, Our Team      |
      | Careers         | Open Positions, Life at Company |
      | Investors       | Financials, Reports             |
      | Partner with Us | Business, Individual            |
      | Media           | News, Events                    |

  Scenario Outline: User clicks an option within the dropdown
    Given I have opened the dropdown for "<navigation_item>"
    When I click on the "<option>" in the dropdown
    Then I should be taken to the "<expected_page>" page

    Examples:
      | navigation_item | option            | expected_page      |
      | About Us        | Company Overview  | About Company Page |
      | Careers         | Open Positions    | Careers Page       |
      | Investors       | Financials        | Financials Page    |
      | Partner with Us | Business          | Partner Page       |
      | Media           | News              | News Page          |

  Scenario: Dropdown closes when clicking outside
    Given I have opened the dropdown for "About Us"
    When I click outside the dropdown area
    Then the dropdown should close

  Scenario: Dropdown closes when another navigation item is clicked
    Given I have opened the dropdown for "About Us"
    When I click on the "Careers" in the main navigation bar
    Then the dropdown for "About Us" should close
