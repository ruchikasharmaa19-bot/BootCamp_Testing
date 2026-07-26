package com.Framework.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import utility.ExcelDataReader;

public class LoginEasyCalculation extends BaseClass{
@Test
public void loginApp() throws  Exception {
	ExcelDataReader excel = new ExcelDataReader();
	excel.getStringData("Sheet1", 0, 0);
	LoginPage Sheet1= PageFactory.initElements(driver,LoginPage.class);
	Sheet1.loginEasyCal(excel.getStringData("Sheet1",0,0),excel.getStringData("Sheet1", 0, 1));
	Thread.sleep(10000);
}
}
