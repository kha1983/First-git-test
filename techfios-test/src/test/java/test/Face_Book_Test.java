package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Book_Test {
	
	//public static void main(String []  args   )  throws Exception {
		
	//Setting Chrome driver properties
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//Create an object of Chrome driver and that will help us to open ChromeBrowser
		//WebDriver driver=new ChromeDriver();
		
		//Will direct you to facebook site
		//driver.get("https://www.facebook.com");
		
		//Make the facebook site bigger
		//driver.manage().window().maximize();
		
		//Always use throws Exception for Thread.sleep
		//Thread.sleep(5000);
		
		//To close and quit the site
		//driver.close();
		//driver.quit();

     
	
     //}
	
	@Test
	public void Facebook_Test()  throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Khadak Kathayat");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("KK56357citi");
		
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		driver.close();
		driver.quit();
	}

}
