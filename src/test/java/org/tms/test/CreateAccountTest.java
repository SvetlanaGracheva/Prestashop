package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.MyAccountPage;
import org.tms.service.CreateAccountService;
import org.tms.service.LoginPageService;

import static org.tms.util.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class CreateAccountTest extends BaseTest {
    CreateAccountService createAccountService;

    @BeforeClass
    public void setUp() {
        createAccountService= new CreateAccountService();}

    @Test
    public void createaccountTest(){
        MyAccountPage myAccountPage= createAccountService.createNewAccount();
        String actualTextOfAccount=myAccountPage.getTextPageName();
        Assert.assertEquals(actualTextOfAccount,EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual text of the page does not match expected!");

    }
}
