Feature: They add product to cart & checkout

       Scenario Outline: Users successfully add product to cart and proceeds checkout
       Given the user "<user>" is on the shopping page
       When they clicks on "<Add to Bag>" button for product
       Then the product "<product>" should be added into shopping bag
       And they should click on place order button
       #And enter shipping address
       #And confirm the order
       #And the order should be placed successfully message "<message>" displayed
      
       Examples:  | user  | product  | checkout       | message                |
                  | user1 | product1 | user1 checkout | Successfully placed    |
                  | user2 | product2 | user2 checkout | Something went wrong   |
