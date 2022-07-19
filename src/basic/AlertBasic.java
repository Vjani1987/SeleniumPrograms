package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBasic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement pop=driver.findElement(By.xpath("//a[@class='analystic']"));
		pop.click();
		
		Thread.sleep(2000);
		WebElement pop1=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		pop1.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement pop2=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		pop2.click();
		
		Thread.sleep(2000);
		WebElement pop3=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		pop3.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		WebElement pop4=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		pop4.click();
		
		Thread.sleep(2000);
		WebElement pop5=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		pop5.click();
		
		Thread.sleep(10000);
		driver.switchTo().alert().sendKeys("Vani");
		driver.switchTo().alert().accept(); 
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);	
			
	}		

}
