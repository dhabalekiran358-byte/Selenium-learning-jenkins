package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abc1 {

	private static final WebElement Category = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.name("radioButton")).click();
		
		WebElement x=driver.findElement(By.xpath("//td[text()='Rahul Shetty']/parent::tr/td[3]"));
		
		System.out.println("Price of course is = "+x.getText());
		
		WebElement Category=driver.findElement(By.id("dropdown-class-example"));
		Select se=new Select(Category);
		se.selectByValue("option2");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
