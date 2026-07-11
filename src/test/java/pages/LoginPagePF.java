package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	List<WebElement>dashboardText;
	
	@FindBy(xpath = "//button[@type='submit']")
	List<WebElement> loginBtnList;
	
	public LoginPagePF(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String uname)
	{
		
		
	}
}
