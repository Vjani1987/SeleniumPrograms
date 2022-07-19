package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		//System.out.println("*****Login Page*****");
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("JithuVani");
		
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("Jithu@1715");

		Thread.sleep(2000);
		WebElement login= driver.findElement(By.id("login"));
		login.click();

		//System.out.println("*****Search Page*****");
		Thread.sleep(2000);
		WebElement location= driver.findElement(By.id("location"));
		Select s= new Select(location);
		s.selectByValue("Melbourne");
		
		Thread.sleep(2000);
		WebElement hotels= driver.findElement(By.id("hotels"));
		Select s1= new Select(hotels);
		s1.selectByIndex(3);
		
		Thread.sleep(2000);
		WebElement roomtype= driver.findElement(By.id("room_type"));
		Select s2= new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");
		
		Thread.sleep(2000);
		WebElement noofrooms= driver.findElement(By.id("room_nos"));
		Select s3= new Select(noofrooms);
		s3.selectByValue("1");
		
		Thread.sleep(2000);
		WebElement checkindate= driver.findElement(By.id("datepick_in"));
		checkindate.sendKeys("7.7.22");
		
		Thread.sleep(2000);
		WebElement checkoutdate= driver.findElement(By.id("datepick_out"));
		checkoutdate.sendKeys("8.7.22");
		
		Thread.sleep(2000);
		WebElement adultsperroom= driver.findElement(By.name("adult_room"));
		Select s4= new Select(adultsperroom);
		s4.selectByValue("2");
		
		Thread.sleep(2000);
		WebElement childrenperroom= driver.findElement(By.name("child_room"));
		Select s5= new Select(childrenperroom);
		s5.selectByValue("1");
		
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.name("Submit"));
		search.click();
		
		//System.out.println("*****Continue Page*****");
		Thread.sleep(2000);
		WebElement select= driver.findElement(By.name("radiobutton_0"));
		select.click();
		
		Thread.sleep(2000);
		WebElement button =driver.findElement(By.id("continue"));
	    button.click();
		
		//System.out.println("*****Booking Page*****");
	    Thread.sleep(2000);
	    WebElement firstname= driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		firstname.sendKeys("Vanitha");
		
		Thread.sleep(2000);
		WebElement lastname= driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		lastname.sendKeys("Ramu");
		
		Thread.sleep(2000);
		WebElement billingaddress= driver.findElement(By.id("address"));
		billingaddress.sendKeys("VKL nagar,Thudiyalur");
		
		Thread.sleep(2000);
		WebElement cardno= driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		cardno.sendKeys("1234567891234567");
		
		Thread.sleep(2000);
		WebElement creditcardtype= driver.findElement(By.id("cc_type"));
		Select s6= new Select(creditcardtype);
		s6.selectByVisibleText("VISA");
		
		Thread.sleep(2000);
		WebElement expirymonth= driver.findElement(By.id("cc_exp_month"));
		Select s7= new Select(expirymonth);
		s7.selectByIndex(7);
		
		Thread.sleep(2000);
		WebElement expiryyear= driver.findElement(By.name("cc_exp_year"));
		Select s8= new Select(expiryyear);
		s8.selectByValue("2022");
		
		Thread.sleep(2000);
		WebElement cvv= driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		cvv.sendKeys("567");
		
		Thread.sleep(2000);
		WebElement booknow= driver.findElement(By.xpath("//input[@type='button']"));
		booknow.click();				
}
		
}