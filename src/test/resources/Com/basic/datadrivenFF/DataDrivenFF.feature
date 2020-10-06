Feature: Create account of facebook2
As a user you need to open facebook home page and do the validations


Scenario Outline: Validate create user multiple fields21
Given User need to be on facebook login page
When User enter user "<user>" first name
And User enter user "<lastname>" lastname
Then User mobile fields should be blank
Then close browser

Examples:
| user | lastname |
|Tom   | Jerry    |
|Lorren| hardy    |
