Feature: Create account of facebook9
As a user you need to open facebook home page and do the validation

Scenario: Validate First Name field91
Given User need to be on facebook login page
When User enter user first name
Then User checks user first name is present
Then close browser

Scenario: Validate create user multiple fields92
Given User need to be on facebook login page
When User enter user first name
And User enters user lastname
Then User checks user first name is present
Then User mobile fields should be blank
Then close browser

