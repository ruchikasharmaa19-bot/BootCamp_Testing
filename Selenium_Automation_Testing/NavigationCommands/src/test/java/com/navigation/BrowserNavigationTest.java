package com.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserNavigationTest {
WebDriver driver;

@Parameters("browser")
@BeforeMethod
public void setup(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		driver =new ChromeDriver();
		
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge")){
			 driver =new EdgeDriver();
		
	
}
driver.manage().window().maximize();
}
@Test
public void navigationTest() throws InterruptedException  {
	driver.get("https://testng.org/testng-1.0.dtd");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
