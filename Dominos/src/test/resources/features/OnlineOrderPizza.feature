Feature: Order Online Pizza

Scenario Outline: Order Veg pizza with Beverages

  
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
And Verify pizza and Quantity from "<SheetName>" and  <RowNumber> and subtotal value only 
Then Explore menu
And Click on beverages add pepsi into cart
And Verify the Pepsi 475ml Value
And add pepsi 475ml quantity of twelve
And Verify Pizza and Beverages Quantity subtotal value into cart 
And Remove pepsi 475ml quantity of six into cart
And Remove Margherita pizza quantity of one into cart
And Verify after remove Pizza and Beverages Quantity subtotal final cart value

Examples:
|SheetName    |Item                   |Quantity|
|VegPizza     |Margherita             |   2    |
|VegPizza     |Peppy Paneer           |   2    |
|VegPizza     |Primavera Gourmet-Pizza|   2    |
|Beverages    |Pepsi 475ml            |   12   |
|Checkout Cart|Margherita             |   2    |
|Checkout Cart|Peppy Paneer           |   2    |
|Checkout Cart|Primavera Gourmet-Pizza|   2    |
|Checkout Cart|Pepsi 475ml            |   12   |
|Final Cart   |Margherita             |   1    |
|Final Cart   |Peppy Paneer           |   2    |
|Final Cart   |Primavera Gourmet-Pizza|   2    |
|Final Cart   |Pepsi 475ml            |   6    |
