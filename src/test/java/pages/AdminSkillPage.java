package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminSkillPage {

    WebDriver driver;

    public AdminSkillPage(WebDriver driver) {
        this.driver = driver;
    }

    By adminMenu = By.xpath("//span[normalize-space()='Admin']");
    By qualification = By.xpath("//span[normalize-space()='Qualifications']");
    By skills = By.xpath("//a[normalize-space()='Skills']");
    By addButton = By.xpath("//button[contains(.,'Add')]");
    By name = By.xpath("//label[normalize-space()='Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    By description = By.xpath("//textarea");
    By submit = By.xpath("//button[@type='submit']");

    

	public void clickAdmin() {
		// TODO Auto-generated method stub
		driver.findElement(adminMenu).click();
	}

	public void clickQualification() {
		// TODO Auto-generated method stub
		driver.findElement(qualification).click();
	}

	public void clickSkills() {
		// TODO Auto-generated method stub
		driver.findElement(skills).click();
	}

	public void clickAddButton() {
		// TODO Auto-generated method stub
		driver.findElement(addButton).click();
	}
	
	public void enterName(String skillName) {
        driver.findElement(name).sendKeys(skillName);
    }

    public void enterDescription(String descriptionText) {
        driver.findElement(description).sendKeys(descriptionText);
    }

    public void clickSubmit() {
        driver.findElement(submit).click();
    }
}