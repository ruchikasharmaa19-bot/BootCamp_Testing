package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

    public static WebDriver startBrowser(String browser) {

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("Chrome")) {

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();

        } else {

            throw new IllegalArgumentException("Invalid Browser Name: " + browser);

        }

        driver.manage().window().maximize();

        return driver;
    }
}