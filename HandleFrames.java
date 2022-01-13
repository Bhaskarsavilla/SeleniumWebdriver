package Webdriverpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleFrames {
WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void browser() {
		driver.close();
	}
	
@Test	
public void Iframe() {
	
driver.findElement(By.linkText("Button")).click();

WebElement   title=driver.findElement(By.className("entry-title"));
Assert.assertEquals(title.getText(), "Button");
	

//Switching to the iframe


driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

WebElement insideframe=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));

Assert.assertEquals(insideframe.getText(), "A button element");
	
	insideframe.click();
	
	//switching to the parentframe
	
	driver.switchTo().parentFrame();
	WebElement example1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h2"));
	Assert.assertEquals(example1.getText(),"Examples");
	
	
}
	
}
