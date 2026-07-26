package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHandOver {
int linkCount;
java.util.List<WebElement> list;
@Test
public void mouseover() throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easycalculation.com/");
	WebElement ele = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Others']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	list =driver.findElements(By.xpath("//a[normalize-space()='Download']"));
	System.out.println("no of links"+list.size());
	for (int i = 0;i < list.size();i ++) {
		System.out.println(list.get(i).getText());
	}
	Thread.sleep(2000);
	WebElement ele2 = driver.findElement(By.xpath("//span[@class='lang']"));
	ele2.click();
	System.out.println(driver.getCurrentUrl());
	
}
}
