package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		//Click
		WebElement clickButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		Actions ac = new Actions(driver);
		ac.click(clickButton).build().perform();
		
		//right click
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rightClickButton).build().perform();
		
		//Double click
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(doubleClickButton).build().perform();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		//moveToElement
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		ac.moveToElement(women).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		ac.click(casual).build().perform();
		
		//dragAndDrop
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
