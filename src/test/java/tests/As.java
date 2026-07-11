package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class As {

	@Test(priority=1)
	void Test1()
	{

		System.out.println("This is Test1");

	}
	
	@Test(priority=2)
void PageTitle()
{
	System.out.println("This is page Title Test");
}
	
	@Test(priority=3)
	void RegisterUser()
	{
		System.out.println("This is registeruser test");
	}
	
	@Test(priority=4,dependsOnMethods="RegisterUser",dataProvider="testData")
	void Login(String uname,String pwd)
{
	System.out.println("This is login test");
	System.out.println("username :"+uname);
	System.out.println("password : "+pwd);
}
	
	@Test(priority=5)
void AddEmployee()
{
	System.out.println("This is add employee");
}
	
	@BeforeMethod()
	void beforeMethod()
	{
		System.out.println("This is Before Method");
	}
	
	@AfterMethod()
	void afterMethod()
	{
		System.out.println("This is After Method");
	}
	
	@BeforeClass()
	void beforeClass()
	{
		System.out.println("This is Before class");
	}
	
	@AfterClass()
	void afterClass()
	{
		System.out.println("This is After class");

	}

	@DataProvider(name = "testData")
	public Object[][] loginData()
	{
		return new Object[][]
		{
			{"admin","admin123"},
			{"admin","admin"},
			{"admin123","admin123"},
			{"admin123","admin1234"}
			
		};
	}
	
}


