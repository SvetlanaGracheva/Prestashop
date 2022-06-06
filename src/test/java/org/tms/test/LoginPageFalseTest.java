package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;
import org.tms.page.Page;
import org.tms.service.LoginPageFalseService;
import org.tms.service.LoginPageService;

public class LoginPageFalseTest extends Page {
    private LoginPageFalseService loginPageFalseService;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @BeforeClass
    public void setUp() {
        loginPageFalseService = new LoginPageFalseService();
    }

    @Test
    public void loginFalseTest(){
        LoginPage loginPage= loginPageFalseService.login();
        String actualTextOfMainPage=myAccountPage.getTextPageName();
        String expectedPageText = loginPage.getTextAuthenticationFailed();
        Assert.assertEquals(actualTextOfMainPage,expectedPageText,"The actual text of the page does not match expected!");
    }

}
