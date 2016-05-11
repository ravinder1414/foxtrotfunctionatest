@cleanbrowser @test @staging
Feature: Labanimal Login

  Scenario: Login user with valid credentials
    Given User navigate to Labanimal.com login page
    When User enters valid credentials
    Then User should be able to login successfully

  Scenario: Login user with invalid credentials
    Given User navigate to Labanimal.com login page
    When User enters invalid credentials
    Then User should not be able to login

  Scenario: Logout user successfully
    Given User is loggedin and on Labanimal.com home page
    When User clicks on logout link
    Then User should be logout successfully
