 Feature: Money Transfers between Accounts
       Scenario Outline: Successfully transfer money between accounts using Net banking
       Given the user "<user>" is on Net Banking application
       When they enter "<account Number>" or registered mobile number "<mobile Number>"
       And enter transfer amount "<amount>"
       And enter net banking password "<password>"
       Then money should be transferred successfully message "<message>" displayed

       Example:

           | user  | account number | mobile number | amount | password  | message           |
           | user1 | 453566587654   | 8678456533    | 25000  | Pass@123# | Successfully Send |
           | user2 | 789987543123   | 9676543232    | 0      | Abc@123#  | Invalid Amount    |

