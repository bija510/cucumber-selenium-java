Feature: Create account of facebook100
As a user you need to open facebook home page and do the validations

Scenario: Validate create user multiple fields1011
Given User need to be on facebook login page
When User enter user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate create user multiple fields102
Given User need to be on facebook login page
When User enter user "Ryan" first name
And User enter user "Jack" lastname
Then User checks user "Ryan" first name is present
Then User mobile fields should be blank
Then close browser