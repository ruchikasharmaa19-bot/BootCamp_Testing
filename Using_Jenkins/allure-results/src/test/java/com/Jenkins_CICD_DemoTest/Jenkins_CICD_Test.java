package com.Jenkins_CICD_DemoTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Jenkins_CICD_Test {

    WebDriver driver;
    String baseURL = "https://www.demoblaze.com/";

    // Screenshot Method
    public void takeScreenshot(String stepName) throws IOException {

        File folder = new File("./ScreenShots");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(folder, stepName + ".png");

        FileUtils.copyFile(source, destination);

        System.out.println(stepName + " Screenshot Captured");
    }

    @AfterMethod
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }

    // ================= PRIORITY 0 =================

    @Test(priority = 0)
    public void ChromeBrowserTest() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    // ================= PRIORITY 1 =================

    @Test(priority = 1)
    public void FirefoxBrowserTest() {

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");
    }

    // ================= PRIORITY 2 =================

    @Test(priority = 2)
    public void EdgeBrowserTest() {

        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");
    }

    // ================= PRIORITY 3 =================

    @Test(priority = 3)
    public void ChromeBrowserTitleValidation() {

        String expectedTitle = "Home - Docs by LangChain";

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle, "Chrome Title Mismatch");
    }

    // ================= PRIORITY 4 =================

    @Test(priority = 4)
    public void FirefoxBrowserTitleValidation() {

        String expectedTitle = "Home - Docs by LangChain";

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle, "Firefox Title Mismatch");
    }

    // ================= PRIORITY 5 =================

    @Test(priority = 5)
    public void EdgeBrowserTitleValidation() {

        String expectedTitle = "Home - Docs by LangChain";

        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.langchain.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle, "Edge Title Mismatch");
    }

    // ================= PRIORITY 6 =================

    @Test(priority = 6)
    public void PurchaseProduct() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Step 1
        driver.get(baseURL);
        takeScreenshot("Step01_HomePage");

        // Step 2 - Login
        driver.findElement(By.id("login2")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

        driver.findElement(By.id("loginusername"))
                .sendKeys("manishyadav92124@gmail.com");

        driver.findElement(By.id("loginpassword"))
                .sendKeys("8816077162");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Thread.sleep(4000);

        takeScreenshot("Step02_Login");

        // Step 3 - Open Product
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6"))).click();

        takeScreenshot("Step03_Product");

        // Step 4 - Add To Cart
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        takeScreenshot("Step04_AddToCart");

        // Step 5 - Cart
        driver.findElement(By.id("cartur")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr")));

        Assert.assertTrue(driver.getPageSource().contains("Samsung galaxy s6"));

        takeScreenshot("Step05_Cart");

        // Step 6 - Place Order
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        driver.findElement(By.id("name")).sendKeys("Manish Yadav");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Gurgaon");
        driver.findElement(By.id("card")).sendKeys("2301921520106");
        driver.findElement(By.id("month")).sendKeys("July");
        driver.findElement(By.id("year")).sendKeys("2026");

        takeScreenshot("Step06_OrderDetails");

     // Step 7 - Purchase
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        // Wait for confirmation popup
        WebElement confirmation = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'sweet-alert')]//h2")));

        String actual = confirmation.getText();

        System.out.println("Confirmation : " + actual);

        takeScreenshot("Step07_Confirmation");

        Assert.assertEquals(actual, "Thank you for your purchase!");

        // Click OK
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='OK']"))).click();

        Thread.sleep(2000);

        // Final Screenshot
        takeScreenshot("Step08_Completed");

        // Do not click Logout
    }
}