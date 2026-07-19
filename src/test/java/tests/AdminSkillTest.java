package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminSkillPage;
import pages.LoginPage;

public class AdminSkillTest extends BaseTest {

	@Test
    public void verifyAddSkill() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        AdminSkillPage admin = new AdminSkillPage(driver);

        String uname = p.getProperty("username");
        String pwd = p.getProperty("password");

        lp.login(uname, pwd);

        Assert.assertTrue(lp.isDashboardDisplayed());

        String skillName = " Java Selenium";
        String description = "Shreesha Surwase";

        admin.addSkill(skillName, description);

        Assert.assertTrue(admin.isSkillAdded(skillName));

        Reporter.log("Skill Added Successfully", true);

        Thread.sleep(3000);
    }
}
