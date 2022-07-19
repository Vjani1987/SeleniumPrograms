package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("**** All Data****");
		List<WebElement> all_Data= driver.findElements(By.xpath("//table[@cellspacing='0']"));
		for(WebElement all: all_Data) {
		String text= all.getText();
			System.out.println(text);
		}
		
		System.out.println("**** first Row****");
		List<WebElement> p_row= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr[3]"));
		int row=p_row.size();
		System.out.println(row);
		for(WebElement row1: p_row) {
		String text1= row1.getText();
		System.out.println(text1);
		}
		
		System.out.println("***First column***");
		List<WebElement> pc= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[1]"));
		int pc1=pc.size();
		System.out.println("size :"+ pc1);
		for(WebElement pc2:pc) {
		String text2=pc2.getText();
		System.out.println(text2);
		}
		
		System.out.println("***second column***");
		List<WebElement>p_column= driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[2]"));
		int size=p_column.size();
		System.out.println("size :"+size);
		for(WebElement pcol:p_column) {
		String pcol2=pcol.getText();
		System.out.println(pcol2);
		}
		
		System.out.println("***particular data***");
		WebElement pdata= driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[2]/td[1]"));
		String pdata1= pdata.getText();
		System.out.println(pdata1);
	
		System.out.println("***Header TagName***");
		List<WebElement> ad= driver.findElements(By.tagName("th"));
		for(WebElement ad1: ad) {
		String ad2=ad1.getText();
		System.out.println(ad2);
	
	}
		System.out.println("***All row TagName***");
		List<WebElement> tr= driver.findElements(By.tagName("tr"));
		for(WebElement tr1: tr) {
		String tr2=tr1.getText();
		System.out.println(tr2);
	
	}
		System.out.println("*** all Column TagName***");
		List<WebElement> td= driver.findElements(By.tagName("td"));
		for(WebElement td1: td) {
		String td2=td1.getText();
		System.out.println(td2);
	
	}
		System.out.println("***using following***");
		WebElement data= driver.findElement(By.xpath("//td[normalize-space()='Handle Exceptions']//following::td[1]"));
		String data1=data.getText();
		System.out.println(data1);
						
		System.out.println("***using following1***");
		WebElement info= driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following:: td[1]"));
		String info1=info.getText();
		System.out.println(info1);
		
		System.out.println("***using preceding***");
		WebElement pre= driver.findElement(By.xpath("//td[normalize-space()='80%']//preceding::td[1]"));
		String pre1=pre.getText();
		System.out.println(pre1);
		
		System.out.println("***using ancestors***");
		WebElement ans= driver.findElement(By.xpath("//td[normalize-space()='Handle Exceptions']//ancestor::td"));
		String ans1=ans.getText();
		System.out.println(ans1);
}
}



