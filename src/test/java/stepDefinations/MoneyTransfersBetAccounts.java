package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoneyTransfersBetAccounts {

	@Given("the user {string} is on Net Banking application")
    public void userIsOnNetbankingApplication(String user) {
        System.out.println("The user " + user + " is on the Netbanking Application");
    }

    @When("they enter {string} or registered mobile number {string}")
    public void enterRegisterMobileNoOrAccountNo(String accountNo, String mobNo) {
        if (accountNo.equals("34234354322") || mobNo.equals("9876543210")) {
            System.out.println("Valid Credentials");
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    @And("enter transfer amount {double}")
    public void enterAmount(double amount) {
        if (amount > 0) {
            System.out.println("Valid amount: " + amount);
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    @And("enter net banking password {string}")
    public void enterNetbankingPassword(String password) {
        if (password.equals("Abx@32332")) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Enter a valid Password");
        }
    }

    @Then("money should be transferred successfully message {string} displayed")
    public void message(String message) {
        System.out.println(message);
    }
}
