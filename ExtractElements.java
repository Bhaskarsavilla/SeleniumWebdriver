package Webdriverpart1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ExtractElements {
	@Test

	public void getelemnts() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://edition.cnn.com/");
		WebElement story=driver.findElement(By.xpath("//*[@id=\'intl_homepage1-zone-1\']/div[2]/div/div[2]/ul/li[2]/article/div/div[1]"));
		
		
	
		List<WebElement> topstorylinks= story.findElements(By.tagName("a"));
		
	System.out.println("No os storylinks:::"+topstorylinks.size());
	
}
}
