package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			WebDriver driver = new FirefoxDriver();	
			
			driver.get("https://www.google.co.in/");
	
			Thread.sleep(2000);
			
			System.out.println("Page Title: " + driver.getTitle());
	
			driver.quit();
	
	}

}
