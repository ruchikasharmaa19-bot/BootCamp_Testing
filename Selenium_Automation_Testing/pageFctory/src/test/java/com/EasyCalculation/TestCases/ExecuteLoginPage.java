package com.EasyCalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EsayCalculationPages.LoginEasyCal;

import helper.BrowserFactory;

public class ExecuteLoginPage {
@Test
public void CheckValidUser() {
	WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
	LoginEasyCal loginPageEasyCal= PageFactory.initElements(driver,LoginEasyCal.class);
	loginPageEasyCal.loginEasyCal("7037051601","7890qw");
}
}
