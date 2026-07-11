package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href='#Single\"']")).click();
		
		
		
		
		
	}

}
