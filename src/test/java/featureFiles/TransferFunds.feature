@Regression
Feature: Fund Transfer

  Background:
    Given The user navigates to the ParaBank website
    When The user types username and password and clicks on the login button
    Then The user should login successfully

  Scenario: Successful fund transfer between accounts
    When The user clicks on transfer funds from the menu
      | transferFunds |

    Then The user should be redirected to the fund transfer page
    And The user selects the following accounts for the transfer
    When The user enters the transfer amount
    And The user clicks the transfer button
      | transferBtn |

    Then The user verifies the transfer amount in the confirmation message.
    When The user clicks on accounts overview
      | accountsOverview |

    And The user clicks on the receiver account number
    Then The user should see the transfer listed in the account details