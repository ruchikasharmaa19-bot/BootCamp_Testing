package dropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop {
	WebDriver driver;
	String baseURL = "https://testautomationpractice.blogspot.com/";

	  
	@Test 
	public void IDLocator() throws InterruptedException {
		WebElement CountryDropdown = driver.findElement(By.id("country"));
		Select countrylist= new Select(CountryDropdown);
		countrylist.selectByVisibleText("India");
		Thread.sleep(10000);
		WebElement option =countrylist.getFirstSelectedOption();
		String countryindex = option.getText();
		System.out.println(countryindex);
				java.util.List<WebElement> clist = countrylist.getOptions();
				int totalmonth = clist.size();
				System.out.println("total months"+totalmonth);
				for (WebElement ele : clist) {
					String counname = ele.getText();
					System.out.println("county name in list"+counname);
				}
	}
}
