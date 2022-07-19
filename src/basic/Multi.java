package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement multiple= driver.findElement(By.xpath("(//select)[6]"));
		Select s= new Select(multiple);
		
		//Boolean multi=s.isMultiple();
		//System.out.println(multi);
		
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Appium");
		
		Thread.sleep(2000);
		s.deselectAll();
		
		
		System.out.println("******All Options*******");
		
		List<WebElement>options=s.getOptions();
		for(WebElement all:options) {
		String text= all.getText();
		System.out.println(text);
		}
		
		System.out.println("*****All Selected Options******");
		
		List<WebElement>all1=s.getAllSelectedOptions();
		for(WebElement sel: all1) {
		String allsel=sel.getText();
		System.out.println(allsel);
		}
	
		System.out.println("****First selected Option****");
		WebElement first=s.getFirstSelectedOption();
		String firstsel=first.getText();
		System.out.println(firstsel);
	}
}	
	
	
	

