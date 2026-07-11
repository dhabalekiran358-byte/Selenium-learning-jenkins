package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder = 'Search for Products, Brands and More']")).sendKeys("iphone16");
		WebElement search = driver.switchTo().activeElement();
        search.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//div[@class = 'kRYCnD gxR4EY']")).click();
		
		
		System.out.println("iphone price is 66,900"+driver.getWindowHandle());
		
		
		
	}

}
