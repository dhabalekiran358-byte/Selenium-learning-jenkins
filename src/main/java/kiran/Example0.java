package kiran;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys("Kiran");
		
	    driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("Dhabale");

		driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("Pusad");
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("kirandhabale@gmail.com");
		
		driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'FeMale']")).click();
		

		driver.findElement(By.xpath("//input[@value = 'Cricket']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Movies']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Hockey']")).click();
		
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		
		WebElement x = driver.findElement(By.id("Skills"));
		 Select s1 = new Select(x);
		 s1.selectByValue("Engineering");
		
		 driver.findElement(By.id("countries")).click();
		 
		 driver.findElement(By.xpath("//span[@role='textbox']")).click();
		 
		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.xpath("//input[@value='1997']")).click(); 
			 
		driver.findElement(By.xpath("//input[@value='1997']")).click(); 
			driver.findElement(By.xpath("//input[@placeholder='Month']")).sendKeys("May");
			
			driver.findElement(By.id("daybox")).click();
			driver.findElement(By.xpath("//input[@value='31']")).click(); 
			
			driver.findElement(By.id("firstpassword")).sendKeys("Pooja55");
			
			driver.findElement(By.id("secondpassword")).sendKeys("Pooja55");
		 
		 
		 
		// Thread.sleep(2000);
		
		
		
		
		
		
		
		
//WebElement Skills=driver.findElement(By.xpath("//select[@type = 'text']")).click();
		
	//	driver.findElement(By.id("countries")).click();
		
		
		
		
		
		
		
	}

	
	}


