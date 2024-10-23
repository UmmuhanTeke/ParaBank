Feature: Open a Bank Account Functionality

  Background:
    Given The user navigates to the ParaBank website
    When The user types username and password and clicks on the login button
    Then The user should login successfully

  Scenario Outline: Opening a New Account
    When The user clicks on the Element in Content
      | openNewAccount |
    Then The user is directed to the bank account creating page
    And The user selects the "<accountType>" type from the drop-down menu
    And The user receives a warning that the new bank account should have a minimum balance
    And The user selects the accountNumber from the Drop-Down menu
    And The user clicks on the Element in Content
      | openNewAccountButton |
    Then The user confirms the successful creation of the new bank account
    And The user clicks on the generated account number.
    Then The user verifies their information in the account details "<accountType>"

    Examples:
      | accountType |
      | CHECKING    |
      | SAVINGS     |
