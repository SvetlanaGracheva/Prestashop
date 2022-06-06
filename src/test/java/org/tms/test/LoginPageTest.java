package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.MyAccountPage;
import org.tms.service.LoginPageService;

public class LoginPageTest extends BaseTest{

    private LoginPageService loginPageService;
    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest(){
        MyAccountPage myAccountPage= loginPageService.login();
        String actualTextOfMainPage=myAccountPage.getTextPageName();
        String expectedPageText = "My account";
        Assert.assertEquals(actualTextOfMainPage,expectedPageText,"The actual text of the page does not match expected!");
    }
}
