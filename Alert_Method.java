package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/");
		
		WebElement Alertimg = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[9]"));
		Alertimg.click();
		Thread.sleep(2000);
		
		WebElement Simple= driver.findElement(By.xpath("//button[text()='Alert Box']"));
		Simple.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert salert = driver.switchTo().alert();
		salert.accept();
		Thread.sleep(2000);
		
		WebElement Calert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		Calert.click();
		org.openqa.selenium.Alert CL = driver.switchTo().alert();
		CL.dismiss();
		Thread.sleep(2000);
		
		WebElement Prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		Prompt.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("Phython");
		alert.accept();
		
		WebElement LB = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
		LB.click();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		WebElement SA = driver.findElement(By.xpath("//button[text()='Sweet Alert']"));
		SA.click();
	}

}
