package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminSkillPage1;
import pages.LoginPage;

public class AdminSkillTest1 extends BaseTest{
	
	AdminSkillPage1 adminSkillPage = new AdminSkillPage1(driver);
	
	@Test(dataProvider = "skillData")
	public void verifyAddSkill(String skillName, String description) {
		adminSkillPage.enterName(skillName);
	    adminSkillPage.enterDescription(description);
	}
	
	@DataProvider(name = "skillData")
	public Object[][] skillData() {
	    return new Object[][]{
	        {"Java", "Java Programming"},
	        {"Python", "Python Programming"}
	    };
	}

}	 
       