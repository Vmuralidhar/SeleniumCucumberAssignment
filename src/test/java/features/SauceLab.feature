  @VerifySauceLabTests
  Feature: Verification of Sauce Lab Site Application
  @scenario1  
  Scenario: To verify adding multiple options in cart and checkout    
    Given user is on saucedemo loginpage   
    And user logged in using correct credential   
      | username | standard_user|    
      | password | secret_sauce | 
       
    And user adds required item to cart 
    And user proceeds to checkout   
    And user enters the following details for checkout    
      | FirstName | abc |   
      | LastName  | def |   
      | PostalCode| 400087| 
    When user confirm checkout    
    Then user verify final confirmation message    
      
  @scenario2
  Scenario: To verify adding removing then adding and checkout      
    Given user is on saucedemo loginpage   
    And user logged in using correct credential     
     | username | standard_user|    
     | password | secret_sauce |    
    And user adds required item to cart 
    Then remove that item to go back   
    And user adds required item to cart   
    And user proceeds to checkout   
    And user enters the following details for checkout    
      | FirstName | abc |   
      | LastName  | def |   
      | PostalCode| 400087|    
    When user confirm checkout    
    Then user verify final confirmation message   
      
  @scenario3
  Scenario: To verify sort low to high    
    Given user is on saucedemo loginpage   
    And user logged in using correct credential     
     | username | standard_user|    
     | password | secret_sauce |    
    And user sorts item low to high   
    And user adds required item to cart   
    And user proceeds to checkout   
    And user enters the following details for checkout    
      | FirstName | abc |   
      | LastName  | def |   
      | PostalCode| 400087|   
    When user confirm checkout    
    Then user verify final confirmation message