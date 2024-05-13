@regression @search @wip
Feature: Buy a gift card
  Scenario: [1] Buy a gift card - happy path
    Given user is on home page
    When user selects Gift Card Value
    When user enters "valid@email.com"
    When user enters "Tom" as first name
