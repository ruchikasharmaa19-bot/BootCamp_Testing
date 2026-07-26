package com.seleniumLocators;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialLinkTest {
	WebDriver driver;
	String baseURL = "https://www.hollandandbarrett.com/";

	  
	@Test
	public void PartialLinkLocator() throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Food & Drink')]")).click();
	}
	public void LinkTest() {
		//driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.partialLinkText("Food")).click();
List<WebElement> links= driver.findElements(By.xpath("//a"));
		int numlinks= links.size();
		System.out.println(numlinks);
		for (int i = 0;i <links.size();i++) {
			System.out.println(links.get(i).getText());
			String str= links.get(i).getText();
			String s="Food";
			if (str ==s) {
				driver.findElement(By.linkText("Food")).click();
				driver.findElement(By.xpath("//img[@alt='Drinks & Juices category product example']")).click();
			}
		}
		
	}

}
