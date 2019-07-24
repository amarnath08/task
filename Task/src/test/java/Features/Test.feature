Feature: Fill Contact Us form on SecurePay website without submitting
  Verify user can navigate to securepay and fill contact us form

  Scenario: Fill contact-us form on securepay website without submitting
    Given user search for securepay on www.google.com.au
    When user navigates to securepay website from serach results
    And user navigates to contact-us
    Then fill contact us form without submitting
