Feature: Create account of facebook3
As a user you need to open facebook home page and do the validations


Scenario: Validate create user multiple fields31
Given User need to be on facebook login page
When Enter following data
  |usernName | UserSurname  |Mobile|
  |Tom       | Hanks        |1234  |
  |Jack      | Danial       |5678  |
      
      #username... for data  to make it more readable