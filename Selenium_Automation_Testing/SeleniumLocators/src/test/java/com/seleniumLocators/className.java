package com.seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class className {
	WebDriver driver;
	String baseURL = "https://www.purplle.com/";
@Test
public void NameLocator() throws InterruptedException {
	driver = new ChromeDriver();
	driver.navigate().to(baseURL);
	driver.manage().window().maximize();
	
	Thread.sleep(10000);
	try {
		driver.findElement(By.id("id attribute is not available for this element")).click();	
		}
	
catch(Exception e) {
	System.out.println("pop up not dispalyed");
}
	driver.findElement(By.className("placeholder-32 d-inline-block")).click();
	//driver.findElement(By.className("ywa-10000")).click();
	String BrowserTitle = driver.getCurrentUrl();
	System.out.println(BrowserTitle);
	
	
}
}
