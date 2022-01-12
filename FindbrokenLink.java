package Webdriverpart1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindbrokenLink {
	
	@SuppressWarnings("deprecation")
	@Test
	public void FindLinks() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://edition.cnn.com/");
		
		//Apply Implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("The total no.of Links : "+links.size());
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		
		
		
		
	}
	

}
