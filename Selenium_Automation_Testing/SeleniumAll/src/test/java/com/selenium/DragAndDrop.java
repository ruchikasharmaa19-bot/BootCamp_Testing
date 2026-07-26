package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void DragDrop() throws Exception{
 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://jqueryui.com/droppable/#default");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Actions action =new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("This element is in iframe - //div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("This element is in iframe - //div[@id='draggable']"))).release().build().perform();
}
}
