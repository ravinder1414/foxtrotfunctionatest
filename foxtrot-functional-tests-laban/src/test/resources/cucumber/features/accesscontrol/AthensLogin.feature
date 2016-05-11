@cleanbrowser @test @staging @live
Feature: Athens Login

  Scenario: Login via Athens Labanimal
    Given I navigate to Labanimal journal access page
    And I click on Article 'Login via Athens' link
    And It navigates to the Athens login page
    When I enter valid Athens credentials and click on login button
    Then I can get full access for Labanimal journal articles
