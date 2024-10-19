Feature: Login Functionality

  Background:
    Given Navigate to the ParaBank website

  Scenario: Login with valid username and password
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario Outline: Login With invalid username and password
    When  Enter "<invalidUsername>" and "<invalidPassword>" and click login button
    Then  message should be displayed
    Examples:
      | invalidUsername | invalidPassword   |
      | VivanC1235298   | uk9gpok3wgwo34345 |
