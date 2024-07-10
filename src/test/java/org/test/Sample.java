package org.test;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	 static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		 driver =new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
System.out.println("After Class");
	}
	
	@Before
	public void before() {
		Date d =new Date();
		
		System.out.println("test start"+d);
		System.out.println("Before");

	}
	
	@After
	public void after() {
Date d =new Date();
		
		System.out.println("test end"+d);
		System.out.println("After");

}	
	
	@Test
	public void test3() { // instead of  main method
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Naveen");
		WebElement txtPass = driver.findElement(By.id("email"));
		txtPass.sendKeys("12345");
		WebElement btnLogin = driver.findElement(By.name("login")); 
		btnLogin.click();
	//	txtUsername.sendKeys("Naveen");

System.out.println("Test 3");
	}
	
	@Test
	public void test1() { // instead of  main method
		driver.get("https://www.facebook.com/");
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		txtFirstName.sendKeys("Naveen");
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		txtLastName.sendKeys("SK");
		WebElement btnSignup = driver.findElement(By.name("websubmit"));
		btnSignup.click();;
System.out.println("Test 1 ");
	}
	 
	@Ignore //ignores particular
	@Test
	public void test2() { // instead of  main method
System.out.println("Test 2");
	}
}


//everything should be public
//b4 and aftr class should be static
//test is compulsory act as main method,can write multiple test