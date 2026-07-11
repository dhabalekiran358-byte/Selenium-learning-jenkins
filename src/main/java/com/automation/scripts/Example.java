package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder = 'Search']")).sendKeys("Abc");
		
		
		
		//driver.findElement(By.name("qgw24v")).click();
		
		//driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		//((WebElement) driver.findElements(By.xpath("//button[@type='submit']"))).click();
		
		
		
	}

	
	}


