package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest_01 {

	WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch()
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Program Files\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");						 
		driver= new FirefoxDriver();
	}

	@Test
	public void launchapp() {

		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
	}

	@Test
	public void searchtext() throws InterruptedException {
		WebElement search = driver.findElement(By.id("sb_form_q"));
		search.sendKeys("intellipaat");
		search.submit();
		System.out.println("Title of the page is:" + driver.getTitle());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void closeTest() throws InterruptedException {
		driver.quit();
	}

}
