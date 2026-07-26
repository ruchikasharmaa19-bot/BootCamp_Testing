package multipleFrames;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class frames {
@Test 
 public void frame() throws Exception {
	WebDriver driver = Helper.startBrowser("GC");
	driver.get("https://www.easycalculation.com/");
	Thread.sleep(1000);
	int totalFrames = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total Frames: " + totalFrames);
	System.out.println(driver.findElements(By.xpath("//span[contains(text(),'Sign in')]")).size());
	driver.switchTo().frame("Calculators");
	driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	driver.findElement(By.id("log_email")).sendKeys("7037051601");

	driver.findElement(By.id("log_password")).sendKeys("7890qw");
	driver.findElement(By.xpath("//input[@name='log_submit']")).click();
	String title= driver.getTitle();
	System.out.println(title);
	
	driver.navigate().to("https://www.easycalculation.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[normalize-space()='Calculators']")).click();
	driver.navigate().to("https://www.easycalculation.com/");
	driver.findElement(By.xpath("//a[normalize-space()='Converters']")).click();
	Thread.sleep(1000);
	String title1 = driver.getTitle();
	System.out.println(title1);
	
}

}
