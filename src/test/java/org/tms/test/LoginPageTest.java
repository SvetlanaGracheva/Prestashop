package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.MyAccountPage;
import org.tms.service.LoginPageService;

import static org.tms.util.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class LoginPageTest extends BaseTest {

    LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest() {
        MyAccountPage myAccountPage = loginPageService.login();
        String actualTextOfMainPage = myAccountPage.getTextPageName();
        Assert.assertEquals(actualTextOfMainPage,EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual text of the page does not match expected!");
    }
}
