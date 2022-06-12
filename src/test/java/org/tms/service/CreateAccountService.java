package org.tms.service;

import org.openqa.selenium.WebDriver;
import org.tms.page.CreateAccountPage;
import org.tms.page.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.tms.util.Constants.*;

public class CreateAccountService {

    CreateAccountPage createAccountPage= new CreateAccountPage();
    LoginPageService loginPageService=new LoginPageService();
    LoginPage loginPage=new LoginPage();
    WebDriver driver;

public void createNewAccount(){
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillemailcreate(EMAIL_CREATE)
            .clickCreateanaccountButton();
  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//НУЖНО ОЖИДАНИЕ!
    createAccountPage.clicktitle();
    createAccountPage.fillinfirstname(FIRST_NAME);
    createAccountPage.fillinlastname(LAST_NAME);
    createAccountPage.fillinpassword(PASSWORD_CREATE);
    createAccountPage.clickRegisterButton();}

    public String getTextPageName(){
return loginPage.getTextAuthenticationFailed();


}

}
