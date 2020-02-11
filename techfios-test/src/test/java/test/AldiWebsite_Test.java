package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AldiWebsite_Test {
	
	@Test
	public void UserWillAbleToLoginKrogerWebsite()      {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kroger.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean status=driver.findElement(By.linkText("Ship")).isDisplayed();
		
		if(status==true)    {
			System.out.println("Element is visible and Test is passed");
		}
		else  {
			System.out.println("Element is not visible and Test is failed");
		}
		

		
		driver.close();
		driver.quit();
		
	
		
		
		
	}

}
