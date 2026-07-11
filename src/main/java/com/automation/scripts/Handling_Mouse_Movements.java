package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mouse_Movements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.istqb.in/index.php");
		Thread.sleep(2000);
		
		WebElement specialist = driver.findElement(By.linkText("SPECIALIST"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(specialist).build().perform();
		
		Thread.sleep(1000);
		
		WebElement procedure = driver.findElement(By.linkText("PROCEDURE"));
		
		act.moveToElement(procedure).build().perform();
		act.click().build().perform();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		specialist = driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(specialist).build().perform();
		Thread.sleep(2000);
		
	}

}
