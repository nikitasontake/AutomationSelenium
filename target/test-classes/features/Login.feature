Feature: User login in govGrants Application
     
     
     @test8
      Scenario: Successful login with valid credentials
      Given the user is on the govGrants login page
      when user enter valid "<username>" and "<password>"
      And click on the login button
      Then user should be redirected to the Home page of govGrants Application

