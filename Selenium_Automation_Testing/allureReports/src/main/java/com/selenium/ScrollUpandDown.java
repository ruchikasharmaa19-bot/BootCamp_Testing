package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
WebDriver driver;
String url ="https://www.meesho.com/";
@org.testng.annotations.Test
public void Test() throws Exception{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(By0,4200)");
}
}
