package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		System.out.println("***All data***");
		List<WebElement> alldata= driver.findElements(By.xpath("//table[@cellspacing='0']"));
		for(WebElement element: alldata) {
		String text=element.getText();
		System.out.println(text);
		}
		
		System.out.println("***particular row***");
		List<WebElement> prow= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr[2]"));
		for(WebElement element1: prow) {
		String text1=element1.getText();
		System.out.println(text1);
		}
		
		System.out.println("***particular column***");
		List<WebElement> pcol= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[1]"));
		for(WebElement element2: pcol) {
		String text2=element2.getText();
		System.out.println(text2);
		}
		
		System.out.println("***particular Data***");
		WebElement pdata= driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[6]/td[2]"));
		String text3=pdata.getText();
		System.out.println(text3);
		
		System.out.println("***particular Data using following***");
		WebElement data= driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[1]"));
		String text4=data.getText();
		System.out.println(text4);
		
		System.out.println("**********************************");
		List<WebElement> allprogress= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[2]"));
		List <Integer>numberlist= new ArrayList<Integer>();
		for(WebElement webelement: allprogress) {
		String individualvalue= webelement.getText().replaceAll("%","");
		numberlist.add(Integer.parseInt(individualvalue));
		}
		System.out.println(numberlist);
		int smallvalue=Collections.max(numberlist);
		System.out.println(smallvalue);
		String smallvaluestring= Integer.toString(smallvalue)+"%";
		String finalxpath="//td[normalize-space()="+"\""+ smallvaluestring + "\""+"]//following::td[1]";
		System.out.println(finalxpath);
		
		WebElement check= driver.findElement(By.xpath(finalxpath));
		check.click();
		
	}
}
