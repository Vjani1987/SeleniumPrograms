package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsDemo {public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

Thread.sleep(2000);
WebElement bestseller= driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
Actions ac= new Actions(driver);
ac.contextClick(bestseller).build().perform();

Robot r= new Robot();
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);

WebElement mobiles= driver.findElement(By.xpath("//a[text()='Mobiles']"));
Actions ac1= new Actions(driver);
ac1.contextClick(mobiles).build().perform();

Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);



WebElement hk= driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
Actions ac2= new Actions(driver);
ac2.contextClick(hk).build().perform();

Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);

Set<String> all=driver.getWindowHandles();
for(String id: all) {
System.out.println(all);
String title=driver.switchTo().window(id).getTitle();
System.out.println(title);

String topic="Home Store: Buy Home & Kitchen products online at best prices in India - Amazon.in";
if(driver.switchTo().window(id).getTitle().equalsIgnoreCase(topic)) {
	break;
}
}
}

}


