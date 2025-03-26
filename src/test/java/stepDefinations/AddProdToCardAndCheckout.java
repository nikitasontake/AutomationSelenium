package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProdToCardAndCheckout {

	WebDriver driver ;
	@Given("the user {string} is on the shopping page")
	public void userIsOnShoppingApp(String user) {
		System.setProperty("webdriver.chrome.driver",  "D://Automation_Trainee//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/noise-colorfit-icon-2-1-8-display-bluetooth-calling-ai-voice-assistant-smartwatch/p/itmd4cd819eadb9f?pid=SMWGEH7VGYMGCP3V&lid=LSTSMWGEH7VGYMGCP3VXIJHDY&marketplace=FLIPKART&store=ajy&srno=b_1_1&otracker=browse&fm=organic&iid=en_fEsZzn0RXhb9XAd4Ypn4aoeDldyedF280UgFenFX9ak0kB4XdWcOjEmw94uaavjzMLJTLDMksEnUReJg4EjNkA%3D%3D&ppt=browse&ppn=browse&ssid=ky8t310c4w0000001742924587075");
		System.out.println("User is on Shopping Page");
	}
	@When("they clicks on {string} button for product")
	public void  clickOnAddToBagButton(String addProduct) {
		System.out.println("Click on add to back Button");
		driver.findElement(By.xpath("//ul[@class='row']//li//button[text()='Add to cart']")).click();
	}
	
	@Then("the product {string} should be added into shopping bag")
	public void productAddedToBag(String product) {
		if(driver.getCurrentUrl().contains(driver.getTitle())) {
			System.out.println("Product added to bag");
		}else 
		System.out.println("Product not added to bag");
	}
	
	@And("they should click on place order button")
	public void clickOnPlaceOrderButton(){
		driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']//span[text()='Place Order']")).click();
		System.out.println("they click on place order button, enter address and choose payment option");
	}
}
