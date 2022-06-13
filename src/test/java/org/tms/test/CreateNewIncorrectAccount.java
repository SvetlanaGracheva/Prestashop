package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.CreateAccountService;

public class CreateNewIncorrectAccount {

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

}
