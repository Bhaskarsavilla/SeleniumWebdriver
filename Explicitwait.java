package Seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait {
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/bhask/Downloads/ExplicitWait.html");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void browser() {
		driver.close();
	}
	
	

	public void verifyalert() {
	
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	
	//Explicitwait
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
		
	}



public void verifyElementClickable() {
	//First perform action
	//Putwait & call expected condition
	//Perform action on Expected Element
	
	driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
	WebDriverWait waite=new WebDriverWait(driver,30);
	waite.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("hidden"))));
	
}


public void verifyElementSelected() {
	driver.findElement(By.xpath("//button[@id='checkbox']")).click();
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
	
}

@Test
public void verifyPresentText() {
	driver.findElement(By.xpath("//button[@id='populate-text']")).click();
	WebDriverWait wait=new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.xpath("//h2[@class='target-text']")), "Selenium Webdriver"));
	driver.close();
}

}
