 Feature: Money Transfers between Accounts
 Scenario Outline: Successfully transfer money between accounts using Net banking
           Given the user "JohnDoe" is on Net Banking application
           When they enter "34234354322" or registered mobile number "9876543210"
           And enter transfer amount 500.00
           And enter net banking password "Abx@32332"
           Then money should be transferred successfully message "Transaction Successful" displayed


       Examples:


           | user  | account number | mobile number | amount | password  | message           |
           | user1 | 453566587654   | 8678456533    | 25000  | Pass@123# | Successfully Send |
           | user2 | 789987543156   | 9676543232    | 500      | Abc@123#  | Invalid Amount    |


       
       