Feature: Money Transfer Between My Accounts

  Background:
    Given The user navigates to the ParaBank website
    When  The user types username and password and clicks on the login button
    Then  The user should login successfully
    When  The user clicks on the Element in Content
      | openNewAccount |
    And   The user clicks on the Element in Content
      | openNewAccountButton |
    And   The user clicks on the generated account number.

  Scenario:Account-to account transfer
    When The user clicks on transfer Funds and selects accounts
      | transferFunds |
    And  The user selects sender account as fromAccount and the receiver account as toAccount
    And  The user clicks on the amount field and enters an amount
      | amount |
    And  The user navigates to the transfer button
      | transFer |
    Then The user checks the amount and receiver account in the confirmation message

    When The user clicks on find transactions in the left navigation menu
      | findTransactions |
    And  The user saves the transaction id from the transfer confirmation message
    And  The user enters the saved transaction id and clicks the button
      | findTransactionsButton |
    Then The user verifies the transferred amount in the transaction details
