package kiran;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ASD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		String expectedmsg = "You clicked a button";
		
		String actualmsg =alt.getText();
		
		if(expectedmsg.contentEquals(actualmsg))
		{
			System.out.println("Alert msg is correct");
		}
		
		else {
			System.out.println("Alert msg is incorrect");
		}
		alt.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
	
		Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		Alert alt1 = wait.until(ExpectedConditions.alertIsPresent());
		
		String expectedmsg1 = "This alert appeared after 5 seconds";
		String actualmsg1 = alt1.getText();
		
		if(expectedmsg1.contentEquals(actualmsg1))
		{
			System.out.println("Alert msg is correct 1");
		}
		else {
			System.out.println("Alert msg is incorrect 1");
		}
		
		alt1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		alt = driver.switchTo().alert();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert alt2 = wait1.until(ExpectedConditions.alertIsPresent());
		
		String expectedMsg2="Do you confirm action?";
		String actualMsg2 = alt2.getText();
		
		if(expectedMsg2.contentEquals(actualMsg2))
		{
			System.out.println("Alert msg is 2");
		}
		else {
			System.out.println("Alert msg is 2");
		}
		//alt.accept();
		alt.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
	
		alt=driver.switchTo().alert();
		
		alt.sendKeys("Hello java");
		
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alt3=wait2.until(ExpectedConditions.alertIsPresent());
			
			String expectedmsg3="Please enter your name";
			String actualmsg3=alt3.getText();
			
			if(expectedmsg3.contentEquals(actualmsg3))
			{
				System.out.println("Alert msg is correct 3");
			}
			else {
				System.out.println("Alert msg is incorrect 3");
			}
	
			alt.accept();
			Thread.sleep(2000);
	
	}

}
