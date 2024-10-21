Feature: Register Functionality

  Scenario: Creation of User Record
    Given Navigate to the ParaBank website
    When Click on the Register button
    And Fill the areas given in the customer data
    Then Click on the Register Submit Button and success message should be displayed
