package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart_Site_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//To set the chrome driver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//To create the object to call chromedriver
		WebDriver driver=new ChromeDriver();
		
		//To open the walmart site
		driver.get("https://www.walmart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		driver.close();
		driver.quit();

	}

}
