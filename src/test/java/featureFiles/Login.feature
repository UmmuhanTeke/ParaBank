Feature: Login Functionality

  Background:
    Given The user navigates to the ParaBank website

  Scenario: Login with valid username and password
    When  The user types username and password and clicks on the login button
    Then  The user should login successfully

  Scenario Outline: Login With invalid username and password
    When  The user types "<invalidUsername>" and "<invalidPassword>" and clicks on the login button
    Then  Error message should be displayed
    Examples:
      | invalidUsername | invalidPassword   |
      | VivanC1235298   | uk9gpok3wgwo34345 |
