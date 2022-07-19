package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement create= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(2000);
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vanitha");
		
		Thread.sleep(2000);
		WebElement surname= driver.findElement(By.name("lastname"));
		surname.sendKeys("Ramu");
		
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("vanitha25ramu@gmail.com");
		
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		password.sendKeys("Jiva@1725");
		
		Thread.sleep(2000);
		WebElement day= driver.findElement(By.xpath("//select[@title='Day']"));
		Select s= new Select(day);
		s.selectByValue("25");
		
		WebElement month= driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Aug");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByIndex(36);	
		
	}
}
