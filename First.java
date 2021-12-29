package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First {
	@Test
	public void Selenium() {
		String URL ="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//To maximize the screen
				driver.manage().window().maximize();
				
		driver.get(URL);
		
		//To maximize the screen
		driver.manage().window().maximize();
		
		// Verify the page title 
		 String pageTitle = driver.getTitle();
		 System.out.println("we get the title"+pageTitle);
		 Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		 
		 //To close the browser
		 driver.close();	
	}
}
