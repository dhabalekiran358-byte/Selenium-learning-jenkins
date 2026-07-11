package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One1 {

	private static final CharSequence TAB = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.name("firstname")).sendKeys("Kiran");
		
		WebElement currentElement = driver.switchTo().activeElement();
		
		currentElement.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("Dhabelee");
		currentElement.sendKeys(Keys.TAB);
		
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("abc@gmail.com");
		
		currentElement.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		
		currentElement = driver.switchTo().activeElement();
		
		currentElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		currentElement.sendKeys("Dhabale");
		
		//currentElement.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER));
		currentElement.sendKeys(Keys.TAB,Keys.TAB);
		currentElement = driver.switchTo().activeElement();
		//driver.findElement(By.name("telephone")).sendKeys("9828374659");
		//currentElement.sendKeys(Keys.ENTER);
		currentElement.sendKeys("9383736354");
		currentElement.sendKeys(Keys.TAB);
		
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("kiran@199755");
		currentElement.sendKeys(Keys.TAB);
		
		currentElement = driver.switchTo().activeElement();
		driver.findElement(By.name("confirm")).sendKeys("kiran@199755");
		currentElement.sendKeys(Keys.TAB);
		
		
		currentElement = driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@value='0']")).click();
		//currentElement.sendKeys(Keys.TAB);
		
		
		
		currentElement = driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		currentElement.sendKeys(Keys.TAB);
		
		currentElement = driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		currentElement.sendKeys(Keys.ENTER);

		
		
		
		
		
		
		
		
		
	}

}
