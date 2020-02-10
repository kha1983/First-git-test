package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class GoogleTest {
	
	//public static void main(String []   args      ) throws Exception   {
		
		//To set the properties of chromedriver
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		//To create the object of chromedriver .it will open chrome
		//WebDriver driver=new ChromeDriver();
		
		//to open the google site
		//driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.close();
		//driver.quit();
	
	@Test
	public void techfios_test()  throws Exception   {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techfios.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		boolean status=driver.findElement(By.linkText("Student Portal")).isDisplayed();
		
		if(status==true)    {
			System.out.println("Element is visible and test is passed");
		}
		else   {
			System.out.println("element is not visible");
			
			throw new RuntimeException("Test failed");
		}
		
		
		driver.close();
		driver.quit();
		
		

	
		
	}
	

		
		
	
	
}