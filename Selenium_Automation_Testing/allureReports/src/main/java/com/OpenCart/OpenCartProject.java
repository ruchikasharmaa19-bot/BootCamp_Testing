package com.OpenCart;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartProject {
	

	    WebDriver driver;

	    @BeforeTest
	    public void setup() {

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("http://demo.opencart.com/");
	    }

	    @Test
	    public void openCartTest() throws InterruptedException {

	        
	        // Step 1 : Login
	        

	        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

	        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ruchikasharmaa19@gmail.com");
	        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("7890qw");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();



	        
	        // Step 2 : Components
	        

	        driver.findElement(By.xpath("//a[normalize-space()='Components']")).click();



	       
	        // Step 3 : Monitors
	      

	        driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']")).click();



	     
	        // Step 4 : Select 25
	      

	        driver.findElement(By.xpath("//select[@id='input-limit']")).click();
	        driver.findElement(By.xpath("//select[@id='input-limit']")).click();



	    
	        // Step 5 : Add first product to Cart
	    

	        driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();



	     
	        // Step 6 : Specification Tab
	      

	        driver.findElement(By.xpath("//a[normalize-space()='Specification']")).click();



	     
	        // Step 7 : Verify details
	    

	        String specificationText =
	                driver.findElement(By.xpath("//td[normalize-space()='Clockspeed']")).getText();

	        Assert.assertFalse(specificationText.isEmpty());



	    
	        // Step 8 : Add to Wish List
	    

	        driver.findElement(By.xpath("//button[@aria-label='Add to Wish List']")).click();



	     
	        // Step 9 : Verify Success Message
	    

	        String wishMsg =
	                driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

	        Assert.assertTrue(wishMsg.contains("Apple Cinema 30"));



	   
	        // Step 10 : Search HTC Touch HD
	   

	        driver.findElement(By.xpath("//input[@placeholder='Search']"))
	              .sendKeys("HTC Touch HD");



	  
	        // Step 11 : Search Button
	   

	        driver.findElement(By.xpath("//button[@id='button-search']")).click();



	  
	        // Step 12 : Search in Product Description
	

	        driver.findElement(By.xpath("//input[@id='input-description']")).click();



	   
	        // Step 13 : Click HTC Touch HD


	        driver.findElement(By.xpath("//img[@title='HTC Touch HD']")).click();



	
	        // Step 14 : Quantity = 3
	        

	        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();

	        driver.findElement(By.xpath("//input[@id='input-quantity']"))
	              .sendKeys("3");



	      
	        // Step 15 : Add to Cart
	   

	        driver.findElement(By.xpath("//button[@id='button-cart']")).click();



	     
	        // Step 16 : Verify Success Message
	   

	        String cartMsg =
	                driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

	        Assert.assertTrue(cartMsg.contains("HTC Touch HD"));



	      
	        // Step 17 : Shopping Cart
	      

	        driver.findElement(By.xpath("//button[normalize-space()='2 item(s) - $244.00']")).click();



	       
	        // Step 18 : Verify Product
	      

	        String product =
	                driver.findElement(By.xpath("//h1[normalize-space()='HTC Touch HD']")).getText();

	        Assert.assertEquals(product, "HTC Touch HD");



	    
	        // Step 19 : Checkout
	    

	        driver.findElement(By.xpath("//strong[normalize-space()='Checkout']")).click();



	   
	        // Step 20 : My Account


	        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();



	   
	        // Step 21 : Logout
	    

	        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();


	        // Step 22 : Verify Logout Heading
	 

	        String heading =
	                driver.findElement(By.xpath("//h1[normalize-space()='Account Logout']")).getText();

	        Assert.assertEquals(heading, "Account Logout");



	     
	        // Step 23 : Continue
	   

	        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

	    }


	    @AfterTest
	    public void tearDown() throws InterruptedException {

	        Thread.sleep(2000);
	        

	    }

	}

