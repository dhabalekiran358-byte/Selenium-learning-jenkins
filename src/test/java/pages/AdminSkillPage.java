package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminSkillPage {

    WebDriver driver;
   
    public AdminSkillPage(WebDriver driver) {
        this.driver = driver;
      
    }

    // Locators
    By adminMenu = By.xpath("//span[text()='Admin']");
    By topBar = By.xpath("//header");
    By qualificationDropDown = By.xpath("//span[text()='Qualifications ']");
    By skillsMenu = By.xpath("//a [text()='Skills']");                     
    By addButton = By.xpath("//button[text()=' Add ']");
    By skillName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");                 //Finds the input field where you type the skill name.
    By description = By.tagName("textarea");
    By saveButton = By.xpath("//button[@type='submit']");

    public void clickAdmin() throws InterruptedException {
        driver.findElement(adminMenu).click();
        Thread.sleep(5000); 
    }

    public void clickQualifications() throws InterruptedException {
        driver.findElement(qualificationDropDown).click();
        Thread.sleep(5000); 
    }

    public void clickSkills() throws InterruptedException {
        driver.findElement(skillsMenu).click();
        Thread.sleep(5000); 
    }

    public void clickAdd() throws InterruptedException {
        driver.findElement(addButton).click();
        Thread.sleep(5000); 
    }

    public void enterSkillName(String skill) {
        driver.findElement(skillName).sendKeys(skill);
    }

    public void enterDescription(String desc) {
        driver.findElement(description).sendKeys(desc);
    }

    public void clickSave() throws InterruptedException {
        driver.findElement(saveButton).click();
        Thread.sleep(5000); 
    }

    public void addSkill(String skill, String desc) throws InterruptedException {
        clickAdmin();
        clickQualifications();
        clickSkills();
        clickAdd();
        enterSkillName(skill);
        enterDescription(desc);
        clickSave();
    }

    public boolean isSkillAdded(String skill) {
        By skillText = By.xpath("//div[text()='" + skill + "']");                   //This is used after saving to verify that the skill appears in the Skills list.
        return driver.findElements(skillText).size() > 0;
    }
}

    

	

	
  
