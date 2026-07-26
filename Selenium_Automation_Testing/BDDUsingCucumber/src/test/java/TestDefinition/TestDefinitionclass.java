package TestDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDefinitionclass {

    WebDriver driver;

    @Given("User should open Chrome Browser")
    public void user_should_open_chrome_browser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("User should enter URL in Browser")
    public void user_should_enter_url_in_browser() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User should navigate to Home Page")
    public void user_should_navigate_to_home_page() {

        System.out.println("Page Title : " + driver.getTitle());
    }

    @When("User should enter Username and Password")
    public void user_should_enter_username_and_password() {

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("User should click on Login button")
    public void user_should_click_on_login_button() {

        driver.findElement(By.id("submit")).click();
    }

    @Then("User should see the Home Page")
    public void user_should_see_the_home_page() {

        String actualTitle = driver.getTitle();

        Assert.assertEquals("Logged In Successfully | Practice Test Automation", actualTitle);

        System.out.println("Login Successful");

        driver.findElement(By.linkText("Log out")).click();

        driver.quit();
    }
}