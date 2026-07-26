package com.SeleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import Utility.Helper;

public class JavaScriptAlerts{
	
  @Test
  public void TestpopUps() throws Exception {
	  
	WebDriver driver = Helper.startBrowser("Chrome");
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	String result= driver.findElement(By.cssSelector("div[class='example'] h4")).getText();
	System.out.println(result);
	Assert.assertEquals("You successfully clicked an alert", result);
	
	
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert alert2= driver.switchTo().alert();
	alert2.dismiss();
	String result2= driver.findElement(By.cssSelector("#result")).getText();
	System.out.println(result2);
	Assert.assertEquals("you clicked cancel", result2);
	
	
}
}
