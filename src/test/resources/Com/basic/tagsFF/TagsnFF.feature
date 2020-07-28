@Important
Feature: Create account of facebook120
As a user you need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field1121
Given User need to be on facebook login page
When User enter user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields2122
Given User need to be on facebook login page
When User enter user "Ryan" first name
And User enter user "Jack" lastname
Then User checks user "Ryan" first name is present
Then User mobile fields should be blank
Then close browser

Scenario: Validate First Name field3123
Given User need to be on facebook login page
When User enter user "David" first name
Then User checks user "David" first name is present
Then close browser

@Regression
Scenario: Validate First Name field4124
Given User need to be on facebook login page
When User enter user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field5125
Given User need to be on facebook login page
When User enter user "David" first name
Then User checks user "David" first name is present
Then close browser
