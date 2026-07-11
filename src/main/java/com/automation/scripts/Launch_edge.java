package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_edge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com");
		
		WebDriver driver = new EdgeDriver();	
		
		//System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com");
		
		//driver.get("https://www.bing.com/");
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		System.out.println("Page Title: " + driver.getTitle());

		driver.quit();


	}

}
