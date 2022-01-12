package SETraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdrop {
	@Test
	
	public void action(){
		String URL ="https://demoqa.com/droppable";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2055601\\workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions demo = new Actions(driver);
		demo.dragAndDrop(from, to).perform();
		driver.close();
	}

}
