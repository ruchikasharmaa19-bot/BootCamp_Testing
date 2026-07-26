package WebDriver.Commands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BrowserCommands {
@Test(priority=0)
public void ChromeBrowserTest() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	
	//Expected and actual value checking
	String expectedTitle = "Holland & Barrett-UK's Leading Health & Wellness Shop";
	String actualTitle = driver.getTitle();
	
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("Test is passed");
	}
	else {
		System.out.println("Test is failed");
	}
	
	System.out.print(actualTitle);
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	String PageContent = driver.getPageSource();
	System.out.println(PageContent);
	driver.quit();
}
@Test(priority=2)
public void FirefoxBrowserTest() {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.12.0");
	driver.manage().window().maximize();
	
	String expectedTitle ="Maven Repository:org.testng>>testng>>7.12.0";
	String actualTitle = driver .getTitle();
	if (actualTitle.equals(expectedTitle)) {
		System.out.println("Test is passed");
	}
	else {
		System.out.println("test id failed");
	}
		
	System.out.print(actualTitle);
		
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	String PageContent = driver.getPageSource();
	System.out.println(PageContent);
	driver.quit();
	
}
@Test(priority=1)
public void EdgeBrowserTest() {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	String expectedTitle = "Test Login | Practice Test Automation";
	String actualTitle = driver .getTitle();
	
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Test is passed");
	}
	else {
		System.out.println("Test is failed");
	}
	
	System.out.print(actualTitle);
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	String PageContent = driver.getPageSource();
	System.out.println(PageContent);
	driver.quit();
	
}


}
