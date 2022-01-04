package Webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsClass {
	
	@Test
	public void findelements()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
	 
	 driver.get("https://ui.cogmento.com/");
	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 
	 WebElement username=driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
			 username.sendKeys("bhaskersavilla@gmail.com");
	WebElement password =driver.findElement(By.name("password"));
			 password.sendKeys("bhaskar");
	 WebElement btn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
			 btn.click();
	 driver.quit();
	 
	}
}
