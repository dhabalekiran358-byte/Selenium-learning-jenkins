package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		// LOcate USername textbox using the id locator , and send text to it
		driver.findElement(By.id("username")).sendKeys("Dilshad");
		
		// Locate Password using name locator
		driver.findElement(By.name("pass")).sendKeys("xyx");
		
		// Locate Login Button and click it 
		driver.findElement(By.id("loginBtn")).click();
		
		
		// Thread.sleep(5000);
		
		// driver.quit();
	}

}
