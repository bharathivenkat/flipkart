Feature: Search the item and add item in the cart

Scenario Outline: 
Given user in the flipkart
When The user added to the cart "<mobilemodel1>" , "<mobilemodel2>" ,"<mobilemodel3>" , "<mobilemodel4>" , "<mobilemodel4>"
Then user add the selected phone model in the cart 

Examples: 
|mobilemodel1|mobilemodel2|mobilemodel3|mobilemodel4|mobilemodel5|
|Samsung|samsung|iphone|iphone|iphone|


