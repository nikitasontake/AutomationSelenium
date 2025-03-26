package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String [] args) throws InterruptedException {
		//connect to the actual browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com/search?q=linkedin+login&oq=lin&gs_lcrp=EgZjaHJvbWUqDQgCEAAYgwEYsQMYgAQyDwgAEEUYORiDARixAxiABDITCAEQLhiDARjHARixAxjRAxiABDINCAIQABiDARixAxiABDIGCAMQBRhAMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgzNjM3ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//open new tab
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		driver.get("https://chatgpt.com/c/67bc1213-d1d8-800f-8e69-b9de143e39f1");
		//Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
	}		

}
