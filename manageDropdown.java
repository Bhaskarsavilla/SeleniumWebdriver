package Webdriverpart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class manageDropdown {

	WebDriver driver=null;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
	
	}
	
	
	@AfterMethod
	public void browser() {
		driver.close();
	}
	@Test
	
	public void droopdown() {
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		//SelectByIndex
		
		Select select=new Select(monthdropdown);
		select.selectByIndex(4);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//SelectByValue
		select.selectByValue("7");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//SelectByVisibleText
		select.selectByVisibleText("Sep");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getOptions()
		List<WebElement> monthvalues=select.getOptions();
		for(WebElement month:monthvalues) {
			System.out.println(month.getText());
			
		}
		
		
	}
	
}
