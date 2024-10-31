@Regression
Feature: Loan Application

  Background:
    Given The user navigates to the ParaBank website
    When The user types username and password and clicks on the login button
    Then The user should login successfully

  Scenario: Request Loan Positive
   When The user clicks on Request Loan button
      | requestLoanButton |

    And The user types Loan Amount Box and DownPaymentBox
      | loanAmountBox  | 400 |
      | downPaymentBox | 100 |

    And The user selects the account number from the Drop-Down menu
    And The user clicks on the Apply Now button
      | applyNowButton |

    Then The user verifies the confirmation message
    And The user clicks on new account number
    Then The user verifies the details of the Account Details

  Scenario: Request Loan Negative
   When The user clicks on Request Loan button
      | requestLoanButton |

    And The user types Loan Amount Box and DownPaymentBox
      | loanAmountBox  | 10000 |
      | downPaymentBox | 500   |

    And The user selects the account number from the Drop-Down menu
    And The user clicks on the Apply Now button
      | applyNowButton |

    Then The user displays the denied message