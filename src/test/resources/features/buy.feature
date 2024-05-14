@regression @wip
Feature: [1]Buy a gift card

  Background:     Given user is on home page

  Scenario: [1.1] Buy a gift card - happy path
    When user selects Gift Card Value
    When user enters "valid@email.com"
    When user enters "Tom" as first name
    When user enters "Jones" as last name
    And user clicks checkout
    Then user is on confirm page
#    When user clicks Confirm Details
#    Then user is on payment page
#    When user enters card details
    Then "Payment accepted, thank you!" message is displayed
