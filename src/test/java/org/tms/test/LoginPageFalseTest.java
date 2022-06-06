package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;
import org.tms.page.Page;
import org.tms.service.LoginPageFalseService;

import static org.tms.util.Constants.EXPECTED_TEXT_AUTHENTICATION_FAILED;


public class LoginPageFalseTest extends Page {
     LoginPageFalseService loginPageFalseService;;

    @BeforeClass
    public void setUp() {
        loginPageFalseService = new LoginPageFalseService();
    }

    @Test
    public void loginFalseTest(){
        LoginPage loginPage= loginPageFalseService.login();
        String actualTextOfMainPage=loginPage.getTextAuthenticationFailed();
        Assert.assertEquals(actualTextOfMainPage,EXPECTED_TEXT_AUTHENTICATION_FAILED, "The actual text of the page does not match expected!");
    }

}
