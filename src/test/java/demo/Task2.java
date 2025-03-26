package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.youtube.com/");
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("http://www.linkedin.com");
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().to("http://www.wikipedia.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();
	}

}
