package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLogin2 {
	
	
	WebDriver driver;
	
	@Given("the user is on login page")
	public void userIsOnLoginPage() {
		System.setProperty("webdriver.chrome.driver", "D://Automation_Trainee//chromedriver-win64//chromedriver.exe");

        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXH0vVuoHnLHieWHFAc1pa3bmy-O5CshVGoUa_qnj52lQjeLtaQGq4cJGcMs2yCgv9d6g8EVcUxiyA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1328677406%3A1742921497498071");
		System.out.println("User is on login Page");
	}

	@When("they enter valid username {string}")
	public void userEntersValidCredentials(String username) {
		System.out.println("User Enter mobile no or gmail");
		driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@type='email']")).sendKeys("nikitasontakke43@gmail.com");
		
	}

	@And("they click on next button for enter password")
	public void clickOnNextButtonForEnterPassword() {
		System.out.println("Enter password message displayed");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next'] ")).click();
		
	}
   
	@And("they enter password {string}")
	public void enterPassword(String password) {
		System.out.println("they enter password");
		driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@type='password']")).sendKeys("Password@12345#");
		
	}
	
	@And("they click on next button to redirected to home page")
	public void clickOnNextButtonForRdtHomePage() {
		System.out.println("they click on next button for redirect to Home Page");
		driver.findElement(By.xpath("//button[@type='button']//span[@class='VfPpkd-vQzf8d' and text()='Next']")).click();
		
	}
	@Then("they should be redirected to the home page")
	public void userRedirectedToHomepage() {
		System.out.println("Validate Redirected to Homepage or not");
		if(driver.getCurrentUrl().contains(driver.getTitle())) {
			System.out.println("User Successfully redirected to Homepage");
		}else {
			System.out.println("Invalid Credentials , user Remains same page");
		}
	
	}
	
	@And("get message {string}")
	public void getMessage(String message) {
		System.out.println("Expected Message = "+message);
		driver.quit();
	}

}
