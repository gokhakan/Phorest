@regression @wip
Feature: Buy a gift card
  Scenario: [1] Buy a gift card - happy path
    Given user is on home page
    When user selects Gift Card Value
    When user enters "valid@email.com"
    When user enters "Tom" as first name
    When user enters "Jones" as last name
    And user clicks checkout
    Then user is on confirm page
    When user clicks Confirm Details
    Then user is on payment page
    When user enters card number
