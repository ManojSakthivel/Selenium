package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("manoj.sakthi234@gmail.com");
        boolean displayed = email.isDisplayed();
        System.out.println(displayed);
        String attribute = email.getAttribute("name");
        System.out.println(attribute);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("Kkk*963.");
        boolean pud = password.isDisplayed();
        System.out.println(pud);
        boolean enabled = password.isEnabled();
        System.out.println(enabled);
        WebElement dd = driver.findElement(By.name("login"));
        dd.click();
	}
}