@regression
Feature: [3] Gift card values

  Background:
    Given user is on home page

  Scenario: [3.1] Value too low
    When user selects "Other"
    And user enters 19
    Then "The minimum spend is $20 and the maximum spend is $1000." message is displayed

  Scenario: [3.2] Value too high
    When user selects "Other"
    And user enters 1001
    Then "The minimum spend is $20 and the maximum spend is $1000." message is displayed
