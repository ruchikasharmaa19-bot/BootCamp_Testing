package com.seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementByLink {
	WebDriver driver;
	String baseURL = "https://www.hollandandbarrett.com/";

	  
	@Test
	public void IDLocator() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		try {
			driver.findElement(By.xpath("")).click();	
			}
		
	catch(Exception e) {
		System.out.println("");
	}
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		driver.findElement(By.linkText("Vitamins & Supplements")).click();
List<WebElement> links = driver.findElements(By.xpath("//a"));
int linkCount= links.size();
int total=0;
  total = total +links.size();
 System.out.println("num of links"+linkCount);
 for(int i = 1;i<links.size();i++) {
	 System.out.print(links.get(i).getText());
 }
}
}
