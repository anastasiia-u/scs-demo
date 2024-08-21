Feature: Validate Dropdown Functionality in the Navigation Bar
  As a user, I want to ensure that the dropdowns in the navigation bar work correctly so that I can navigate the site effectively.

  Scenario: User clicks on the About Us dropdown
    Given the user is on the main page
    When the user clicks on the About Us dropdown
    Then the dropdown should display its contents

  Scenario: User navigates to a link from the dropdown
    Given the user has opened the About Us dropdown
    When the user clicks on a link in the dropdown
    Then the user should be navigated to the corresponding page