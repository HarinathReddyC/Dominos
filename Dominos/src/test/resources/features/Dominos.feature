Feature:  order online dominos website Functionality

  Scenario Outline: Order online pizza functionality
  
    Given Open browser and enter url
    And Click on order online now
    And Enter your delivery address and pick on address
    When Click on veg pizza menu 
    And Select on Margherita pizza quantity of two
    And Verify the Margherita pizza value
    And Select on primavera Gourmet Pizza quantity two
    And Verify the primavera Gourmet Pizza value
    And Select on Peppy Paneer pizza quantity of two
    And Verify the Peppy Paneer Pizza value
    And Verify subtotal value only pizzas
    Then Explore menu
    And Click on beverages add pepsi into cart
    And Verify the Pepsi 475ml Value
    And add pepsi 475ml quantity of twelve
    And Verify subtotal value total cart
    And Remove pepsi 475ml quantity of six into cart
    And Remove Margherita pizza quantity of one into cart
    And Verify subtotal final cart value

