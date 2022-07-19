package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://leafground.com/pages/drop.html");
	
	Thread.sleep(2000);
	WebElement drag= driver.findElement(By.id("draggable"));
	WebElement drop= driver.findElement(By.id("droppable"));
	
	Actions ac= new Actions(driver);
	ac.dragAndDrop(drag, drop).build().perform();
	
}
}


