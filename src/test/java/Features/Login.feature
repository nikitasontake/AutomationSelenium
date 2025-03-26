
Feature: User login in govGrants Application
     
     
   
      Scenario: Successful login with valid credentials
      Given the user is on the govGrants login page
      When user enters valid username and password
      And clicks on the login button
      Then user should be redirected to the Home page of govGrants Application

