Feature: Check Google

  @Berkay
  Scenario: Validate
    Given borwsers is open
    And   users is on google search page
    When users enters username "iberkayuslu_41@hotmail.com"
   When users enters password "123789465Bb"
    And   hitss enter
    Then  users is navigated to search result





