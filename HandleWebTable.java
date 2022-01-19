package Webdriverpart3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleWebTable {
	WebDriver driver=null;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\OneDrive\\Desktop\\workspace\\SeleniumTest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		
	
	}
	
	
	@AfterMethod
	public void browser() {
		driver.close();
	}
	

	@Test
	
	public void managetable() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'moremoney\']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'showMoreLess\']")).click();
		driver.findElement(By.xpath("//*[@id=\'dataTable\']"));
		
		//Get Count Rows
		List<WebElement> totalrows=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		System.out.println("Total No of rows : "+totalrows.size());
		
		//Get Count Coloumns
		List<WebElement> totalcols=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total No of cols : "+totalcols.size());
		
		// get data of Specific row
		System.out.println("data of 3rd row");
		List<WebElement> columns=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[3]/td"));
		for(WebElement column:columns) {
			
			
			System.out.println(column.getText());
		}
		
		//Get Data of a Column
		
		System.out.println("data of 1st coloumn");
		List<WebElement> column=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		for(WebElement col:column) {
		
			System.out.println(col.getText());
			}
		
		//Print Data of Complete Table
		
		System.out.println("------Complete Data-------");
		for(WebElement row:totalrows) {
			System.out.println(row.getText());
		}
		
		
		
	}
	
	
	
	
	

}
