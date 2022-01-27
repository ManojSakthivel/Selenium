package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//Interface
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//getScreenshotAs
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//location
		File dest = new File("C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\amazon.png");
		
		//Copy the screenshot to the location
		
		FileUtils.copyFile(src, dest);
		
		
	}
	
	

}
