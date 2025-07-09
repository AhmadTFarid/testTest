Feature: Login functionality

  Scenario: get two title name
    Given the user is on google page
    When user get the title from first page
    And clicks on Gmail at the top corner
    Then user get the title from second page

