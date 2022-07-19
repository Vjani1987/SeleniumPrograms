package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo2 {
	
		public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://leafground.com/pages/drop.html");
			
			Thread.sleep(2000);
			WebElement click= driver.findElement(By.id("draggable"));
			Actions ac= new Actions(driver);
			ac.clickAndHold(click).build().perform();
			
			Thread.sleep(2000);
			WebElement drop= driver.findElement(By.id("droppable"));
			Actions ac1= new Actions(driver);
			ac1.release(drop).build().perform();		
			
		}
		}


