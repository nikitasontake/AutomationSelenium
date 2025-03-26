Feature: Money Transfer Between accounts 
       Scenario: Successfully transfers money between accounts using UPI application
       Given the user is on the UPI application
       When user enters a valid account number or  registered UPI mobile number 
       And enter the transfer amount
       And enter correct UPI pin
       Then money should be transferred successfully
       And the user should receive a transaction confirmation message
