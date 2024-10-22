Feature: Open a Bank Account Functionality

  Background:
    Given Navigate to the ParaBank website
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Opening a New Account
    When Click on the Element in Content
      | openNewAccount |
    And The user is directed to the bank account creating page
    And The user selects the "<accountType>" type from the drop-down menu
    And The user receives a warning that the new bank account should have a minimum balance
    And The user selects the accountNumber from the Drop-Down menu
    And Click on the Element in Content
      | openNewAccountButton |
    Then The user confirms the successful creation of the new bank account

    Examples:
      | accountType      |
      | Checking Account |
      | Savings Account  |
