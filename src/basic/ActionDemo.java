package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	Thread.sleep(2000);
	WebElement course= driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions ac= new Actions(driver);
	ac.moveToElement(course).build().perform();
	
	Thread.sleep(2000);
	WebElement mouseover= driver.findElement(By.xpath("//span[text()=\"Data Science Training\"]"));
	Actions ac1= new Actions(driver);
	ac1.moveToElement(mouseover).build().perform();
	
	Thread.sleep(2000);
	WebElement mouseover1= driver.findElement(By.xpath("//span[text()=\"Data Science with R Training\"]"));
	Actions ac2= new Actions(driver);
	ac2.click(mouseover1).build().perform();
	
	}
}
