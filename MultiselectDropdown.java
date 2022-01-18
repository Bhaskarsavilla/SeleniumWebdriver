package Webdriverpart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiselectDropdown {
	WebDriver driver=null;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		
	
	}
	
	
	@AfterMethod
	public void browser() {
		driver.close();
	}
	
	@Test
	
	public void multiselect() {
		
	driver.switchTo().frame("iframeResult");
	WebElement multiple=driver.findElement(By.name("cars"));
		
		
		Select select = new Select(multiple);
		//IsMultiple()
		System.out.println(select.isMultiple());
		
		select.selectByIndex(1);
		select.selectByIndex(3);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//first selected option
		System.out.println(select.getFirstSelectedOption().getText());
		
		//Get all selected options
		
		List<WebElement> selectedoptions=select.getAllSelectedOptions();
		System.out.println("ALL Selected values");
		for(WebElement selectedvalue:selectedoptions) {
			
			System.out.println(selectedvalue.getText());
		}
		
		select.deselectAll();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
