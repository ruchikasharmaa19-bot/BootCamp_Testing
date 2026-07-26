package com.SeleniumWebDriver_EdgeBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();

	}

}
