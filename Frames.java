package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//Single frame

		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("JAVA");
		
		//Default content - from frame to main page
		driver.switchTo().defaultContent();
		
		//Multiframe
		
		WebElement button = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		button.click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox2.sendKeys("SELENIUM");
		
		//Parent frame - from inner to outerframe
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		

	}

}
