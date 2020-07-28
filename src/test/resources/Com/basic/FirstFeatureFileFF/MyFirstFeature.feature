Feature: Create account of facebook4
As a user you need to open facebook home page and do the validation

Scenario: Validate First Name field41
Given User need to be on facebook login page
When User enter user first name
Then User checks user first name is present


#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user lastname
#Then User checks the first name is present
#But User mobile fields should be blank