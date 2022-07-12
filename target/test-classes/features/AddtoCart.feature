Feature: Cart 
		 The user has ability to add and remove items from the cart.

  @Cart 
  Scenario: The user add 4 items into the basket 
	Given customer is on product page
		When product page is accessible
		And he added four items in the card
		Then he see 4 items in the cart

	@Cart 
  Scenario: The user remove 1 items from the basket 
	Given customer is on product page
		When product page is accessible
		And he removed 1 items from the cart
		Then he see 3 items in the cart

	