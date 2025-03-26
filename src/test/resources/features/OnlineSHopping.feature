Feature: User add product to cart and checkout
       Scenario: User successfully add the product and checkout
       Given the user is on the shopping page
       When the user clicks on "Add to Bag" button
       Then the product should be added into shopping bag
       And the user proceeds to the checkout page
       And enters the shipping address
       And confirm the order
       Then the order should be placed successfully  
