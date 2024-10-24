@Smoke @Regression @Accounts
Feature: Register Functionality

  Scenario: Creation of User Record
    Given The user navigates to the ParaBank website
    When The user clicks on the register button and fills the areas given in the customer data and clicks on the submit button
    Then Success message should be displayed
