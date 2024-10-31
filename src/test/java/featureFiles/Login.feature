@Smoke @Regression
Feature: Login Functionality

  Background:
    Given The user navigates to the ParaBank website

  Scenario: Login with valid username and password
    When  The user types username and password and clicks on the login button
    Then  The user should login successfully

  Scenario: Login With invalid username and password
    When  The user types invalid username and invalid password and clicks on the login button
    Then  Error message should be displayed