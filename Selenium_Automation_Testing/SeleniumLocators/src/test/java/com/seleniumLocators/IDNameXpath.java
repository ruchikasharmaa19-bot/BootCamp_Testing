package com.seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDNameXpath {
WebDriver driver;
String baseURL = "https://www.hollandandbarrett.com/";

  
@Test
public void IDLocator() throws InterruptedException {
	driver = new ChromeDriver();
	driver.navigate().to(baseURL);
	driver.manage().window().maximize();
	
	/*driver.findElement(By.xpath("//a[normalize-space()='Calculators']")).sendKeys("");
	driver.findElement(By.id("id_email2")).sendKeys("ruchikasharmaa19@gmail.com");
	
	driver.findElement(By.name("password1")).sendKeys("Password1235@##");
	*/
	Thread.sleep(10000);
	try {
		driver.findElement(By.id("id attribute is not available for this element")).click();	
		}
	
catch(Exception e) {
	System.out.println("pop up not dispalyed");
}
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Food & Drink')]")).click();
	driver.findElement(By.xpath("//img[@src='https://dam.hollandandbarrettimages.co.uk/uk_ie/fns-food-hybrid-clp-page-new.png']")).click();
	driver.findElement(By.xpath("//div[@class='ProductCard-module_title__cGT4y'][normalize-space()='Cashew Nuts 800g']")).click();
	String expectedName= "Logged In Successfully | Practice Test Automation";
	String actualName= driver.getTitle();
	if(expectedName.equals(actualName))
	{
		System.out.println("correct");
	}
	else {
		System.out.print("Does not match");
	}
	
}
}
