package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_Practice {
	

	@Test
	public void UserWillAbleToLoginTwitter()  throws Exception   {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[name='session[username_or_email]']")).sendKeys("9722158094");
		
		driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys("KK56357citi");
		
		driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
		Thread.sleep(5000);
		
		boolean status=driver.findElement(By.xpath("//*[contains(text(),'Welcome to Twitter!')]")).isDisplayed();
		
		if(status==true)    {
			System.out.println("Element is visible and test is passed");
		}
		else   {
			System.out.println("Element is not visible and test is failed");
			
			throw new RuntimeException("Test Failed");
		}
		
		//Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	
		
	}
	
	
	

}



