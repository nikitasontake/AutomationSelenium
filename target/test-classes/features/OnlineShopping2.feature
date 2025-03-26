Feature: They add product to cart & checkout
       Scenario Outline: Users successfully add product to cart and proceeds checkout
       Given the user "<user>" is on the shopping page
       When they clicks on "Add to Bag" button for "<product>"
       Then the "<product>" should be added into shopping bag
       And they should be proceeds to checkout page "<checkout>"
       And enter shipping address
       And confirm the order
       And the order should be placed successfully  
      
       Examples : | user  | product | checkout       |
                  | user1 | product1| user1 checkout |
                  | user2 | product2| user2 checkout |

