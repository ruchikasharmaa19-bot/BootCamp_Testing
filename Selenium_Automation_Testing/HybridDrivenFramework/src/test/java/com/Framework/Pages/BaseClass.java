package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataReader;
import utility.Helper;

public class BaseClass {
public WebDriver driver;
public ExcelDataReader excel;
public ConfigDataProvider config;
@BeforeSuite
public void SetUp() {
	excel = new ExcelDataReader();
	config = new ConfigDataProvider();
}
public void BrowserTest() {
	driver = BrowserFactory.BrowserOptions(driver, config.getBrowser(), config.getAppUrl());
}
@AfterClass
public void tearDown() {
	BrowserFactory.quitBrowser(driver);
}
@AfterMethod
public void tearDownMethod(ITestResult result) {
	if (result.getStatus()== ITestResult.FAILURE) {
		Helper.capturedScreenshot(driver);
	}
}
}
