Feature: Google
  Scenario: test steps
    Given go google
    When the user selects search area
    And user sends search key
    Then search results displays