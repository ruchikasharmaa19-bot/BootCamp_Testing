package com.navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class navigation {
	WebDriver driver;
	@Test
	public void navigationDemo() {
		driver = new ChromeDriver();
		driver.navigate().to("https://dev.azure.com/FirstAmerica/Selenium%20-%20Automation%20Testing/_workitems/edit/71/");
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		String Title= driver.getTitle();
		System.out.println(Title);
		URL = driver.getCurrentUrl();
		driver.quit();
	}
	
@Test
public void NavigateBack() {
	driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.navigate().to("https://www.selenium.dev/downloads/");
	String Title= driver.getTitle();
	System.out.println(Title);
	URL = driver.getCurrentUrl();
	System.out.println(URL);
}
@Test
public void NavigateForward() {
	driver = new ChromeDriver();
	driver.get("https://www.atlassian.com/software/jira?referer=jira.com");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.navigate().forward();
	String Title= driver.getTitle();
	System.out.println(Title);
	driver.navigate().forward();
	URL = driver.getCurrentUrl();
	System.out.println(URL);
}
@Test
public void NavigateRefresh() {
	driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.navigate().refresh();
	String Title= driver.getTitle();
	System.out.println(Title);
	driver.navigate().refresh();
	URL = driver.getCurrentUrl();
	System.out.println(URL);
}

}
