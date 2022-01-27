package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Kumar S\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		Signin.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("manoj.sakthi234@gmail.com");
		
		WebElement CreateButton = driver.findElement(By.id("SubmitCreate"));
		CreateButton.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[1]"));
		firstname.sendKeys("ManojKumar");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[2]"));
		lastname.sendKeys("Sakthivel");
		
		WebElement email1 = driver.findElement(By.id("passwd"));
		email1.sendKeys("Keets@234");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s= new Select(day);
		s.selectByValue("28");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 =new Select(month);
		s1.selectByIndex(5);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(year);
		s2.selectByValue("1993");	
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check1.click();
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		check2.click();
		
		WebElement companyName = driver.findElement(By.id("company"));
		companyName.sendKeys("HTC Global Services");
		
		WebElement address1 = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address1.sendKeys("301 Memorial Medical Pkwy");
		
		WebElement address2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		address2.sendKeys("STE 500c");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("Daytona Beach");
		
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s3 =new Select(state);
		s3.selectByVisibleText("Florida");
		
		WebElement zipCode = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		zipCode.sendKeys("32117");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s4 =new Select(country);
		s4.selectByVisibleText("United States");
		
		
		WebElement addText = driver.findElement(By.id("other"));
		addText.sendKeys("Shopping is to experience a new brand");
		
		WebElement Num1 = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		Num1.sendKeys("6382209878");
		
		WebElement MobileNum = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		MobileNum.sendKeys("9840914317");
		
		WebElement Alias = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		Alias.sendKeys("Same as the above");
		
		WebElement Reg = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Reg.click();		
	}
	
	

}
