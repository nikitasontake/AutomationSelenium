      
       Feature: Login in Gmail Application
      Scenario Outline: Successful login in Gmail Application with valid credentials
      Given the user is on login page
      When they enter valid username "<email>"
      And they click on next button for enter password 
      And they enter password "<password>"
      And they click on next button to redirected to home page
      Then they should be redirected to the home page
      And get message "<message>"

Examples: | email    | password | message             |
          | user1    | Pass@123 | Login Successful    |
          | user2    | 12345667 | Invalid Credentials |
      