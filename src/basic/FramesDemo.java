package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		WebElement box=driver.findElement(By.xpath("//input[@type='text']"));
		box.sendKeys("Santhosh");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement box1=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		box1.click();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		WebElement box2=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		box2.sendKeys("Vanitha");
		
		
}

}