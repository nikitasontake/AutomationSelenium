package stepDefination_Ass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver = new ChromeDriver();
	@Given("User is on login page")
	public void userIsOnLoginPase() {
		driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/AnnouncementView?id=a1bDj000001QLEdIAO&RefreshBehaviour=null&TableName=ActiveFundingOpportunitiesAll&TableType=flextable&retURL=%2Fapex%2Fc__PhaseView%3Ft%3DFundingOpportunity");
		System.out.println("User is on login Page");
	}
	
	@When("user enter valid credentials")
	  public void userEntersValidCredentials() {
		  System.out.println("User Enter Valid Username and Password");
		  driver.findElement(By.id("username")).sendKeys("krishnacr7@reisystems.in.ktorgn");
		  driver.findElement(By.id("password")).sendKeys("Password@12345");
	  }
	  
	  @And("clicks on login button")
	  public void userClickOnLoginButton() {
		  System.out.println("Login Successful");
		  driver.findElement(By.id("Login")).click();
	  }
	  
	  @Then("User should be redirected to the Homepage")
	  public void userRedirectedToHomepage() {
		  System.out.println("User Successfully Redirected to Homepage");
		  driver.quit();
	  }
}
