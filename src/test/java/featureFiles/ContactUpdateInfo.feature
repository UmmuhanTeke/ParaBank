Feature: Contact Update Details

  Background:
    Given The user navigates to the ParaBank website
    When The user types username and password and clicks on the login button
    Then The user should login successfully

  Scenario: Update Contact Information(Positive)
    When The user clicks on the Update Contact Info button
      | updateContactInfoButton |

    Then The user accesses the update profile page
    And  The user views their information
    And  The user updates the information they want
    When The user clicks on the Update Profile button
      | updateProfileButton |

    Then The user verifies the confirmation message on the Profile Updated page
    And  The user clicks on the Log Out button
    When The user logs in to the site again
    Then The user clicks on the Update Contact Info button
      | updateContactInfoButton |

    And  The user verifies the updated version of their contact information

  Scenario: Update Contact Information(Negative)
    When The user clicks on the Update Contact Info button
      | updateContactInfoButton |

    Then The user accesses the update profile page
    And  The user views their information
    And  The user deletes at least three optional fields from their contact information and leaves them blank
    When The user clicks on the Update Profile button
      | updateProfileButton |

    Then The user verifies the warning messages for the fields left blank