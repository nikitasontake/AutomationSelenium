package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoGrantsLogin {

 	WebDriver driver;
	
	
	@Given("the user is on the govGrants login page")
	public void userIsOnLoginPage() {
		System.setProperty("webdriver.chrome.driver", "D://Automation_Trainee//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/AnnouncementView?id=a1bDj000001QLEdIAO&RefreshBehaviour=null&TableName=ActiveFundingOpportunitiesAll&TableType=flextable&retURL=%2Fapex%2Fc__PhaseView%3Ft%3DFundingOpportunity");
		System.out.println("User is on login Page");
	}

	@When("user enters valid username and password")
	public void userEntersValidCredentials() {
		System.out.println("User Enter Valid Username and Password");
		driver.findElement(By.id("username")).sendKeys("krishnacr7@reisystems.in.ktorgn");
		driver.findElement(By.id("password")).sendKeys("Password@12345");
	}

	@And("clicks on the login button")
	public void userClickOnLoginButton() {
		System.out.println("Login Successful");
		driver.findElement(By.id("Login")).click();
	}

	@Then("user should be redirected to the Home page of govGrants Application")
	public void userRedirectedToHomepage() {
		System.out.println("Validate Redirected to Homepage or not");
		if(driver.getCurrentUrl().contains(driver.getTitle())) {
			System.out.println("User Successfully redirected to Homepage");
		}else {
			System.out.println("Invalid Credentials , user Remains same page");
		}
		driver.quit();
	}


}
