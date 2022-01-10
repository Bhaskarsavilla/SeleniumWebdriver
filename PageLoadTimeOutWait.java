package Seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLoadTimeOutWait {
	

	@SuppressWarnings("deprecation")
	@Test
	
	public void PageLoadTimeOut() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://edition.cnn.com/");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 
		 //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 driver.quit();
		
	}

}
