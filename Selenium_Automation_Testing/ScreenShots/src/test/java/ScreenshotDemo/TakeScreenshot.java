package ScreenshotDemo;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import library.Reusibility;

public class TakeScreenshot {
@Test
public void Browser() throws  Exception{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/");
	driver.manage().window().maximize();
	Reusibility.capturedScreenshot(driver, "A. Launch Application-TakeScreenShot");

	System.out.println("Captured Screenshot");
	driver.quit();
}
}
