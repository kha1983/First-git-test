package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {
	
	//public static void main(String []   args   )throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://selenium.dev/downloads/");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		
	//}
	
	
	public static void main(String []   args   )throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		boolean status=driver.findElement(By.xpath("//*[@title='search']")).isDisplayed();
		
		if (status)    {
			System.out.println("Element is visible and Test passed");
		}
		else   {
			System.out.println("Could not find the element");
		}
		driver.close();
		driver.quit();
		
	}

}
