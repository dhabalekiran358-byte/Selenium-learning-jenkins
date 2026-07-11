package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseMovementsDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		WebElement frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		
		WebElement from_drag = driver.findElement(By.id("draggable"));
		
		Thread.sleep(2000);
		WebElement to_drop = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(from_drag, to_drop).build().perform();
		
		
		
	}

}
