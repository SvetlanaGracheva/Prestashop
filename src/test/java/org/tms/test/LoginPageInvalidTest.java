package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.LoginPage;
import org.tms.service.LoginPageService;

public class LoginPageInvalidTest extends BaseTest{

    LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        LoginPage loginPage = new LoginPage();
    }
    @Test
    public void loginPageInvalidTest(){
        LoginPage loginPage= loginPageService.loginPageInvalid();
        String actualTextOfMainPage=loginPage.getTextOfNameInvalidPassword();
        String expectedTextAuthenticationFailed= "Invalid password.";
        Assert.assertEquals(actualTextOfMainPage,expectedTextAuthenticationFailed, "The actual text of the page does not match expected!");
    }
}