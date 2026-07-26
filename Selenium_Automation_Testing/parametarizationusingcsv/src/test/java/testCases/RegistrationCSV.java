package testCases;

import java.time.Duration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationCSV {

    @Test

    public void registerUser() throws Exception {

        List<String[]> users =
                CSVReaderUtility.getCSVData("C:\\csvFileReading\\TestData.csv");

        for(String[] user : users) {

            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.opencart.com/");
            driver.manage().window().maximize();

            driver.manage().timeouts()
                  .implicitlyWait(Duration.ofSeconds(10));

           // driver.get("http://demo.opencart.com/");

            // Step 1 Verify Title

            Assert.assertEquals(driver.getTitle(), "Your Store");

            // Step 2 My Account

            driver.findElement(By.xpath("MY_ACCOUNT")).click();

            // Step 3 Register

            driver.findElement(By.xpath("REGISTER")).click();

            // Step 4 Verify Register Page

            Assert.assertTrue(driver.getPageSource()
                    .contains("Register Account"));

            // Step 5 Enter Details

            driver.findElement(By.xpath("FIRST_NAME"))
                    .sendKeys(user[0]);

            driver.findElement(By.xpath("LAST_NAME"))
                    .sendKeys(user[1]);

            driver.findElement(By.xpath("EMAIL"))
                    .sendKeys(user[2]);

            driver.findElement(By.xpath("TELEPHONE"))
                    .sendKeys(user[3]);

            driver.findElement(By.xpath("PASSWORD"))
                    .sendKeys(user[4]);

            driver.findElement(By.xpath("CONFIRM_PASSWORD"))
                    .sendKeys(user[5]);

            // Step 6 Privacy Policy

            driver.findElement(By.xpath("PRIVACY_POLICY")).click();

            // Step 7 Continue

            driver.findElement(By.xpath("CONTINUE")).click();

            // Step 8 Verify Success Message

            Assert.assertTrue(driver.getPageSource()
                    .contains("Your Account Has Been Created"));

            driver.quit();

        }

    }

}
