Feature: Bill Pay Functionality

  Background:
    Given Navigate to the ParaBank website
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Enter payee information to Bill Pay form
    When Click on the Bill Pay Button
    And User sending the name as "<payeeName>"
    And The user fills in the Billing Information in the customer data
    Then Success message should be displayed

    Examples:
      | payeeName                 |
      | EnerjiSa Electricity Bill |
      | Iski Water Bill           |
      | IGDAS Natural Gas         |



