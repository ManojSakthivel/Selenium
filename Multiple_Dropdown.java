package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[5]"));
		login.click();
		
		WebElement single = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select s =new Select(single);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	    s.selectByIndex(4);
	    WebElement training = driver.findElement(By.name("dropdown2"));
	    Select  s1 = new Select(training);
	    s1.selectByVisibleText("Selenium");
	    WebElement findElement = driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select s2 = new Select(findElement);
	    s2.selectByIndex(3);
	    WebElement mul = driver.findElement(By.xpath("(//select)[6]"));
		Select s3 =new Select(mul);
		s3.selectByIndex(2);
		s3.selectByVisibleText("Appium");
		s3.selectByValue("4");
		s3.deselectByVisibleText("Selenium");
		System.out.println();
		System.out.println("the first selected options");
		WebElement FSO = s3.getFirstSelectedOption();
		String text = FSO.getText();
		System.out.println(text);
		System.out.println();
		
		System.out.println("All options");
		List<WebElement> options = s3.getOptions();
		 for (WebElement opt : options) {
			 String text2 = opt.getText();
			 System.out.println(text2);
		 }
		 
		 System.out.println();
			
			System.out.println("All selected options");
		List<WebElement> ASO = s3.getAllSelectedOptions();
		for (WebElement webElement : ASO) {
			String text3 = webElement.getText();
			System.out.println(text3);
		}
		

	}

}
