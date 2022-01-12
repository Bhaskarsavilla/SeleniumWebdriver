package Webdriverpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtractText {
	@SuppressWarnings("deprecation")
	@Test
	public void Text() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Apply Implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String Headingtext=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();
		System.out.println(Headingtext);
		Assert.assertEquals(Headingtext,"Facebook helps you connect and share with the people in your life." );
		
		String Loginbtn=driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(Loginbtn);
		Assert.assertEquals(Loginbtn,"Log In" );
		
		
	}

}
