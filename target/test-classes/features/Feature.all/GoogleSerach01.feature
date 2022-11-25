Feature:  fuature the test google search functionatily

  Scenario: Validate google search is working


    Given borwser is open
    And   user is on google search page
    When  user enters a text  search box
    And   hits enter
    Then  user is navigated to search result

