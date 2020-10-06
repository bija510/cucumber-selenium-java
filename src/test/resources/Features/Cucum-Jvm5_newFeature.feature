Feature: Demo feature to demonstrate cucumber 5

  Scenario: perform an misc operation
    Given I login as admin
      | username | password |
      | admin    | [blank]  |
    And I have a few books in hand such as java, js, csharp
    Given some more information
      """
      {   
       "Name"   :"David",
       "Address": "PA",
       "Living" : "USA"   
      }

      """
