Feature: Check home page funct

  Scenario: chek logout link
    Given user is logged in
    When user clicks on welcome link
    Then  logout link is displayyed

    Scenario: verify quick launch tool bar is present
      Given user is logged in
      When  user click on dashborad
      Then  quick launch


      #Backgraund user login is logged in
        ##Given = user is on loggen
        ##When  = user click on welcome link
        ##Then  = logut link is displayyed
        ##