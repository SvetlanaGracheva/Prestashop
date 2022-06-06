package org.tms.service;

import org.tms.page.CreateAccountPage;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;

import static org.tms.util.Constants.*;

public class CreateAccountService {

    CreateAccountPage createAccountPage= new CreateAccountPage();
    LoginPageService loginPageService=new LoginPageService();
    LoginPage loginPage=new LoginPage();

public void createNewAccount(){
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillemailcreate(EMAILCREATE)
            .clickcreateanaccountButton();
    createAccountPage.clicktitle();
    createAccountPage.fillinfirstname(FIRSTNAME);
    createAccountPage.fillinlastname(LASTNAME);
    createAccountPage.fillinpassword(PASSWORDCREATE);
    createAccountPage.clickdateofbirthdaysButton();
    createAccountPage.clickdateofbirthyearschoice();
    createAccountPage.clickDateOfBirthMonthsButton();
    createAccountPage.clickdateofbirthmonthschoice();
    createAccountPage.clickdateofbirthyears();
    createAccountPage.clickdateofbirthyearschoice();
    createAccountPage.clickcheckboxnewsletter();
    createAccountPage.clickcheckboxoffers();
    createAccountPage.clickregisterButton();}

    public String getTextPageName(){
return loginPage.getTextAuthenticationFailed();


}

}
