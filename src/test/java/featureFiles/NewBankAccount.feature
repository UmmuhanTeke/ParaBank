Feature: Checking Account Functionality

  Background:
    Given Navigate to the ParaBank website
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario: Checking Account

    When Click on the Element in Content
      | openNewAccount |

    And The user is directed to the bank account creating page

    And The user selects the account type from the drop-down menu
      | accountType |

    And The user receives a warning that the new bank account should have a minimum balance

    And The user selects the account from the Drop-Down menu
      | accountNumber |

    And Click on the Element in Content
      | openNewAccountButton |

    Then The user confirms the successful creation of the new bank account

  Scenario: Savings Account

    When Click on the Element in Content
      | openNewAccount |

    And The user is directed to the bank account creating page

    And The user selects the account type from the drop-down menu
      | accountType |

    And The user receives a warning that the new bank account should have a minimum balance

    And The user selects the account from the Drop-Down menu
      | accountNumber |

    And Click on the Element in Content
      | openNewAccountButton |

    Then The user confirms the successful creation of the new bank account

