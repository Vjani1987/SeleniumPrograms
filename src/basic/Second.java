package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.amazon.com/");
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().back();
		driver.quit();
	}
}