package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		login.click();
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		email.sendKeys("Manoj");
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("Sakthivel");
		WebElement Mobilenum = driver.findElement(By.xpath(("(//input[@type='text'])[3]")));
		Mobilenum.sendKeys("12345678");
		WebElement Pw = driver.findElement(By.id("password_step_input"));
		Pw.sendKeys("Keets@234");
		WebElement date = driver.findElement(By.id("day"));
		Select s= new Select(date);
		s.selectByValue("28");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 =new Select(month);
		s1.selectByIndex(5);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1993");
		
}
}