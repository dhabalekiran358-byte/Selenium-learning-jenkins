package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	private WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() throws IOException
	{
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterMethod
	
	public void closeBrowser() throws InterruptedException
	{
		driver.quit();
		
	}
	
	@Test(priority = 1)
	
	public void chkTitle()
	{
		String expectedTitle = "OrangeHRM";
		String actualTitle = "";
		
		actualTitle = driver.getTitle();
			    
		if (actualTitle.contentEquals(expectedTitle))
		{
			Reporter.log("Title same ..Orange HRM Page opened correctly...Test Passed!",true);
	    	
		}
	    else
	    {
			Reporter.log("Title not same ..orange HRM page not opened...Test Failed",true);

			 Assert.fail();
	    }
		
	}	
	

@Test(dataProvider = "loginData", priority = 2)

public void verifyLogin(String uname, String pwd, String expected)
{
	driver.findElement(By.name("username")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	int foudDashboard = driver.findElements(By.xpath("//h6[text() = 'Dashboard']")).size();
	int foundLoginButton = driver.findElements(By.xpath("//button[@type='submit']")).size();
	int foundErrorMessage = driver.findElements(By.xpath("//p[text()='Invalid credentials']")).size();

	if (expected.equals("valid"))
	{
		
		if ((foudDashboard == 1) && (foundLoginButton == 0))
		Reporter.log("Login is Successful with Valid Credentials - Test Passed",true);
	   else
	    {
		Reporter.log("Login is NOT Successful with Valid Credentials - Test Failed",true);
		Assert.fail();

	    }
	}
	else	
	{
		
		if ((foundErrorMessage == 1) && (foundLoginButton == 1))
		Reporter.log("Login is NOT Successful with  InValid Credentials - Test Passed",true);	
	
		else
		{
			Reporter.log("Test Failed",true);
			Assert.fail();
		}
	
	}
	}
}




