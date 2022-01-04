package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffSignInTest {
	
	@Test
	public void testreddifsignin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	 driver.manage().window().maximize();
	 
	 //open the reddiff.com
	 
	 driver.get("https://www.rediff.com/");
		 
	 //verify  page title
	 String pageTitle=driver.getTitle();
	 Assert.assertEquals(pageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	 
	//click signin button
	WebElement signinlink= driver.findElement(By.linkText("Sign in"));
	 signinlink.click();
	 
	 
	 //Insert username & password
	 WebElement username=driver.findElement(By.name("login"));
	 WebElement password=driver.findElement(By.name("passwd"));
	 username.sendKeys("anshulc55@reddif.com");
	 
	 try {
		 Thread.sleep(4000);
	 }catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 password.sendKeys("test@1223");
	 
	 try {
		 Thread.sleep(4000);
	 }catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 
	 
	 
	 //click on submit button
	 
	 
      WebElement gobtn=driver.findElement(By.name("proceed"));
      gobtn.click();
      
      
	 //verify the profile title
      
      //Assert.assertEquals(driver.getTitle(), "Welcome to reddif");
      
      driver.close();
      
	 
	 
	 
	}

}
