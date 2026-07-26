package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class radioButtonsCount {
	@Test
public void Spicejet () throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-glunga']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[4]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle'][2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-glunga']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')]")).click();
	Thread.sleep(2000);
	@SuppressWarnings("unchecked")
	List<WebElement> circleElements = (List<WebElement>) driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
	
	System.out.println("raadio button details");
	for(int i = 0;i<circleElements.size();i++) {
		WebElement element = circleElements.get(i);
		System.out.print("Button"+(i+1)+":");
		System.out.print("Tag"+element.getTagName());
		System.out.print("Displayed"+element.isDisplayed());
		System.out.print("enablede"+element.isEnabled());
		System.out.print("class"+element.getAttribute("classs"));
		System.out.print("role"+element.getAttribute("role"));
		System.out.print("area checked"+element.getAttribute("area checked"));
		
		
		
		
	}
	driver.quit();
}
}
