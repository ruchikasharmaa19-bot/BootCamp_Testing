package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
static WebDriver driver;
public static WebDriver BrowserOptions(WebDriver driver, String browserName, String AppUrl) {
	if (browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	
} else if (browserName.equalsIgnoreCase("firefox")) {
    driver = new FirefoxDriver();
} else if (browserName.equalsIgnoreCase("edge")) {
    driver = new EdgeDriver();
}
else {
	System.out.println("Invalid Browser Name");
	return null;
}
driver.manage().window().maximize();
driver.get(AppUrl);
return driver;
}
public static void quitBrowser(WebDriver driver) {
	// TODO Auto-generated method stub
	driver.quit();
}
}
