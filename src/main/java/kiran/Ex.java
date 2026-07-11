package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More\']")).sendKeys("iphone 17 pro");
		WebElement search=driver.switchTo().activeElement();
		search.sendKeys(Keys.ENTER);
		
		WebElement a = driver.findElement(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
		a.click();
		System.out.println("iphone price is :"+a.getText());
		
		
		
	}

	
		
	}


