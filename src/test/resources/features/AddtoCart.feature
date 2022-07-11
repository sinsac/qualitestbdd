Feature: addtocart_feature 
		 The user has ability to add and remove items from the cart.

  @Cart 
  Scenario Outline: The user add 4 items into the basket 
	Given customer is on product page
	And adds product to basket
	And customer views basket
	Then 4 items is shown



	