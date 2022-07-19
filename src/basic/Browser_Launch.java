package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("vanitharamu25@gmail.com");
		
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Mindpower@1987");
		
		WebElement login= driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		
		
		}

	}




