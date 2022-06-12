package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.CreateAccountService;

import static org.tms.util.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class CreateAccountTest extends BaseTest {
    CreateAccountService createAccountService;

    @BeforeClass
    public void setUp() {
        createAccountService= new CreateAccountService();}

    @Test
    public void createNewAccountFailedTest(){
        createAccountService.createNewAccountFailed();
        String actualTextOfAccountFailed=createAccountService.getTextInvalidEmailMessage();
        String expectedTextOfAccountFailedText= "Invalid email address.";
        Assert.assertEquals(actualTextOfAccountFailed,expectedTextOfAccountFailedText,"Email incorrect");

    }

    @Test
    public void createAccountTest(){
       createAccountService.createNewAccount();
        String actualTextOfAccount=createAccountService.getTextPageName();
        Assert.assertEquals(actualTextOfAccount,EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual text of the page does not match expected!");

    }
}
