package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// Connect to the actual browser.
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");

		//Up casting-Reference of parent class and Object of child class.
		//control+shift+o
		WebDriver driver = new ChromeDriver();
		//open the web browser
		driver.get("https://mail.google.com/");
		driver.get("https://media.istockphoto.com/id/1394440950/photo/natural-view-cosmos-filed-and-sunset-on-garden-background.jpg?s=612x612&w=0&k=20&c=eBnRobwsk2w_9MqM6bnXukIia5j-ayuMS0PeB6GHN0E=");
		//navigate one url to another
		driver.navigate().to("https://chatgpt.com/c/67bc1213-d1d8-800f-8e69-b9de143e39f1");
		System.out.println("Navigate to Chat gpt");
		//go back to previous url
		driver.navigate().back();
		System.out.println("Back to photos site");
		Thread.sleep(2000);
		
		//go forword to chatgpt again
		driver.navigate().forward();
	
		System.out.println("forword to chatgpt");
		Thread.sleep(2500); 
		//refresh the browser
		driver.navigate().refresh();
		System.out.println("page refresh");
		Thread.sleep(2000);
		
		
		//maximize the window

		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * Opened Google  
          Navigated to YouTube  
         Back to Google  
         Forward to YouTube  
         	Page refreshed  
		 */
		driver.close();

	}

}


