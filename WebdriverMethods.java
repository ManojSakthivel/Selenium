package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		Thread.sleep(2000);
		driver.navigate(). to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.navigate().back();
		String title2 =driver.getTitle();
		System.out.println(title2);
		driver.navigate().forward();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.close();
		
	}
	
	
	
	
	
	
	

}
