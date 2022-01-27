package com.selenium;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Booking {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		Signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("manoj.sakthi234@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Keets@234");
		
    	WebElement signin = driver.findElement(By.id("SubmitLogin"));
		signin.click();
		
		Actions ac = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		ac.moveToElement(women).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		ac.click(casual).build().perform();
		
		
		WebElement spc = driver.findElement(By.xpath("//a[@title='All specials']"));
		spc.click();
		
		WebElement purchase = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
		purchase.click();
		
		Thread.sleep(2000);
		
		WebElement qnty = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		qnty.clear();
		qnty.sendKeys("2");
		
		WebElement sizeslt = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s= new Select(sizeslt);
		s.selectByValue("3");
		
		WebElement addToCart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		addToCart.click();
		
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		
		Thread.sleep(2000);
		
		WebElement checkout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout1.click();
		
		WebElement checkout2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout2.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout3.click();
		
		WebElement payment = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		payment.click();
		
		WebElement confirmOrder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmOrder.click();
		
		Thread.sleep(10000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//getScreenshotAs
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//location
		File dest = new File("C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\automationpractice.png");
		
		//Copy the screenshot to the location
		
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
