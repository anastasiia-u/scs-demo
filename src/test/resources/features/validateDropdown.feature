Feature: Validate Dropdown Functionality in the Navigation Bar
  As an automation engineer
  I want to validate the dropdown functionality in the main navigation bar
  So that users can access all available options correctly

  Background:
    Given I am on the homepage with the navigation bar visible

  Scenario Outline: Clicking on a main navigation item with a dropdown reveals associated options
    When I click on the \