package com.instawork.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Baseclass {

	
	public WebDriver driver;
	
	public Actions action;
	public WebDriverWait wait;
	
	public static Properties prop;
	
	static 
	{
		
		File file = new File("/Users/vinoddp/Documents/workspace/InstaWork/resources/config.properties");
	      
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        prop = new Properties();
        
        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
    }
	public static String driverExe=prop.getProperty("driverExe");
	public static String url=prop.getProperty("url");
	
	public void browserInvoke()
	{
		System.setProperty("webdriver.chrome.driver", driverExe);
		driver=new ChromeDriver();
	}
	
	public void launchGoogle() throws Exception
	{
		System.out.println(url);
		driver.navigate().to(url);
		Thread.sleep(3000);
		//driver.manage().window().maximize();
	}
	
	public void searchForInstawork() throws Exception
	
	{
		driver.findElement(By.id("lst-ib")).sendKeys("Instawork");
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		List<WebElement> results = driver.findElements(By.xpath("//div[@id='ires']//h3/a"));
		//System.out.println(results);
		for (int i = 0; i < results.size(); i++) {
			if(results.get(i).getText().equalsIgnoreCase("Instawork"))
			{
				System.out.println(i+1 + " is the position");
				break;
			}
		}
	}
}