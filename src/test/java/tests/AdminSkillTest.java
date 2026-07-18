package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminSkillPage;
import pages.LoginPage;

@Test
public class AdminSkillTest extends BaseTest {

    private AdminSkillPage adminSkillPage;

    @BeforeMethod
    public void pageSetup() {
    	adminSkillPage = new AdminSkillPage(driver);

        String username = p.getProperty("username");
        String password = p.getProperty("password");

        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);
    }
    
    
    @Test(dataProvider = "skillData")
    public void verifyAddSkill(String skillName, String description) {

        adminSkillPage.clickAdmin();
        adminSkillPage.clickQualification();
        adminSkillPage.clickSkills();
        adminSkillPage.clickAddButton();

        adminSkillPage.enterName(skillName);
        adminSkillPage.enterDescription(description);
    }

    @DataProvider(name = "skillData")
    public Object[][] skillData() {
        return new Object[][] {
            {"Java", "Java Programming"},
            {"Python", "Python Programming"}
        };
    }
}