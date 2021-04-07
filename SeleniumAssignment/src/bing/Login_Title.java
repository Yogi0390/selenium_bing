package bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Title 
{
    public static void main(String[] args) throws InterruptedException 
        {
    	
    	//Launching browser
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogen41\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Logging to bing
		
		driver.get("https:\\www.bing.com");
		driver.manage().window().maximize();
		
		//Searching in bing
		
		WebElement search=driver.findElement(By.id("sb_form_q"));
		search.sendKeys("intellipaat");
		search.submit();
		
		
		//Printing the title of current search page
		
		System.out.println("Title of the page is:"+driver.getTitle());
		Thread.sleep(5000);
		
		//Closing the page
		
		driver.close();		
		}
	}
