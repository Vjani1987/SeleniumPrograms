package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement rightclick= driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions ac= new Actions(driver);
	ac.contextClick(rightclick).build().perform();
	
	Thread.sleep(2000);
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
			
	
}
}


