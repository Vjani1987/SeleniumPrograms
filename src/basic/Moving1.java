package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moving1 {
	static int indexOfTotalCases,indexOfTotalRecovered,indexOfActiveCases;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();

		List<WebElement> allheaders= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead"));
		for(int i=0; i<allheaders.size();i++) {
		String text= allheaders.get(i).getText();
		String headers=text.replaceAll("\n","");
		System.out.println(headers);
		
		if(headers.equalsIgnoreCase("TotalCases")) {
			indexOfTotalCases=i;
		}
		if(headers.equalsIgnoreCase("TotalRecovered")) {
			indexOfTotalRecovered=i;
		}
		if(headers.equalsIgnoreCase("ActiveCases")) {
			indexOfActiveCases=i;
		}
		}
		List<WebElement> allrows= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for(WebElement webelement:allrows) {
		String text= webelement.getText();
		System.out.println(text);
		}
		List<WebElement> all=
	}
}

