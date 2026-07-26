package TestDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseDesignSteps {

    WebDriver driver;

    @Given("User Should Open Chrome Browser")
    public void user_should_open_chrome_browser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("User Should Enter Url in Browser")
    public void user_should_enter_url_in_browser() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User Should Navigate HomePage")
    public void user_should_navigate_home_page() {

        System.out.println("Home Page Title : " + driver.getTitle());
    }

    @When("Enter UserName and Password in Edit Box")
    public void enter_user_name_and_password_in_edit_box() {

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("Click On Login PushButton")
    public void click_on_login_push_button() {

        driver.findElement(By.id("submit")).click();
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {

        String actual = driver.findElement(By.tagName("h1")).getText();
        String expected = "Logged In Successfully";

        Assert.assertEquals(expected, actual);

        System.out.println("Login Successful");

        driver.quit();
    }
}