package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminSkillPage1 {
	
	
	private static final CharSequence describe = null;
	private static final CharSequence fname = null;
	private static final By adminSkillText = null;
	private static final By skillName = null;
	
	WebDriver driver;
	
	
	public AdminSkillPage1(WebDriver driver) {
         
		this.driver = driver;
        
	
	}
	
	By adminMenu =   By.xpath("//span[normalize-space()='Admin']");
	By qualification = By.xpath("//span[normalize-space()='Qualifications']");
	By skills = By.xpath("//a[normalize-space()='Skills']");
	By addButton = By.xpath("//button[contains(.,'Add')]");
	By name = By.xpath("//label[normalize-space()='Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By description = By.xpath("//textarea");
	By submit = By.xpath("//button[@type='submit']");


public void clickAdmin()
{
	driver.findElement(adminMenu).click();
}

public void clickQualification()
{
	driver.findElement(qualification).click();
}

public void clickSkills()
{
	driver.findElement(skills).click();
}

public void clickAddButton()
{
	driver.findElement(addButton).click();
}

public void enterName()
{
	driver.findElement(name).sendKeys(fname);
}

public void enterDescription(String description2)
{
	driver.findElement(description).sendKeys(describe);
	
}

public void enterName(String skillName2) {
	// TODO Auto-generated method stub
	
}

//public String addSkillName() throws InterruptedException
//{
//	wait.until(ExpectedConditions.visibilityOfElementLocated(skillName));
//	Thread.sleep(3000);
//	return null;
//	
//}
//
//public void addSkill(String name2, String description2) {
//	// TODO Auto-generated method stub
//	
}


	










