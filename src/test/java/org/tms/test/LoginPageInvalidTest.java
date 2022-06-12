package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;
import org.tms.service.LoginInvalidPageService;
import org.tms.service.LoginPageService;

public class LoginPageInvalidTest extends BaseTest{

    LoginInvalidPageService loginInvalidPageService;

    @BeforeClass
    public void setUp() {
        loginInvalidPageService= new LoginInvalidPageService();
        LoginPage loginPage = new LoginPage();
    }
@Test
    public void loginPageInvalidTest(){
        LoginPage loginPage=  loginInvalidPageService.login();
        String actualTextOfMainPage=loginPage.getTextAuthenticationFailed();
        String expectedTextAuthenticationFailed= loginPage.getTextOfNameOfMainPageSection();
        Assert.assertEquals(actualTextOfMainPage,expectedTextAuthenticationFailed, "The actual text of the page does not match expected!");
    }
}