package WebDriver.Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open first website
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate to second website
        driver.navigate().to("https://www.facebook.com");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate Back
        driver.navigate().back();
        System.out.println("After Back: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate Forward
        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getTitle());

        Thread.sleep(2000);

        // Refresh the current page
        driver.navigate().refresh();

        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}