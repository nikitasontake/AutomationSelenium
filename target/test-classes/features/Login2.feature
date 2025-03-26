Feature: Login in Gmail Application
      Scenario Outline: Successful login in Gmail Application with valid credentials
      Given the user is on login page
      When they enter valid "<username>" and "<password>"
      And they click on login button
      Then they should be redirected to the home page 
      And display "<massage>"

Examples: | username  | password  | massage                 |
          | user1     | Pass@123  | Login Successful        |
          | user2#    | Xyz@123   | Invalid Credential      |
