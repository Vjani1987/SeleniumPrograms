package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovingTable {
	public static int indexOfTotalCases,indexOfTotalRecovered,indexOfActiveCases;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		
		List<WebElement> allheaders= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead"));
		for(int i=0; i<allheaders.size();i++) {
		String text=allheaders.get(i).getText();
		String header=text.replaceAll("\n"," ");
		System.out.println(header);

		if(header.equalsIgnoreCase("Total Cases")) {
			indexOfTotalCases=i;
			System.out.println("Total Cases :"+indexOfTotalCases);
		}
		if(header.equalsIgnoreCase("Total Recovered")) {
			indexOfTotalRecovered=i;
			System.out.println("Total recovered :"+indexOfTotalRecovered);
		}
		if(header.equalsIgnoreCase("Active Cases")) {
			indexOfActiveCases=i;
			System.out.println("Active Cases:"+indexOfActiveCases);	
		
		}
		Thread.sleep(2000);
		List<WebElement> allrows= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for(int i1=0;i1<allrows.size();i1++ {
		String alldata=allrows.get(i1).getText();
		
		List<WebElement>info=driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td"));
		
		
		Thread.sleep(2000);
		
		for(int j=0;j<alldata.size();j++) {
		//String data=alldata.get(j).getText();
			
			if(get(j).getText().equalsIgnoreCase("India")){
			System.out.println("TotalCases"+data.get(indexOfTotalCases).getText());
			System.out.println("Total Recovered"+alldata.get(indexOfTotalRecovered).getText());
			System.out.println("Active Cases"+alldata.get(indexOfActiveCases).getText());
		}
		}
		}
	}
	}
}


