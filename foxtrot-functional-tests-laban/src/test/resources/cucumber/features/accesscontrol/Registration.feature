@broken @cleanbrowser @staging @live
Feature: Registration

Scenario: I am new user registering at labanimal.com 
Given I have no account on labanimal.com 
When I fill up information required on personal detail page 
And I fill up Ealerts and confirm the registration
Then I should see a registration successful message		
