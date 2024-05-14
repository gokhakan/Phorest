@regression
Feature: [2] Email tests

  Background:     Given user is on home page

  Scenario: [2.1] Email without @
    When user enters "email yahoo.com"
    Then "Please enter a valid email" message appears in red

  Scenario: [2.2] Email with two @
    When user enters "email@email@yahoo.com"
    Then "Please enter a valid email" message appears in red

    Scenario: [2.23] Email without a dot
      When user enters "test@yahoocom"
      Then "Please enter a valid email" message appears in red

  Scenario: [2.4] Email without a value before @
    When user enters "@yahoo.com"
    Then "Please enter a valid email" message appears in red






