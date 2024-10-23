Feature: Bill Pay Functionality

  Background:
    Given The user navigates to the ParaBank website
    When The user types username and password and clicks on the login button
    Then The user should login successfully

  Scenario: Electric Bill Payment
    When The user clicks on the Bill Pay Button
    And  The user types the name in Payee Name box
      | Electricity Bill |

    When The user fills in the Billing Information for the Electricity Bill
    Then The user displays the successful pay message
    When The user clicks on the Bill Pay Button
    And  The user types the name in Payee Name box
      | Water Bill |

    When The user fills in the Billing Information for the Water Bill
    Then The user displays the successful pay message
    When The user clicks on the Bill Pay Button
    And  The user types the name in Payee Name box
      | Natural Gas Bill |

    When The user fills in the Billing Information for the Natural Gas Bill
    Then The user displays the successful pay message
    When The user navigates to the Accounts Overview
    Then The user verifies the details of the Bill Pay information to the Electricity Bill
    Then The user verifies the details of the Bill Pay information to the Water Bill
    Then The user verifies the details of the Bill Pay information to the Natural Gas Bill





