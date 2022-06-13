package org.tms.service;

import org.openqa.selenium.WebDriver;

import org.tms.page.CreateAccountPage;
import org.tms.page.LoginPage;

import static org.tms.util.Constants.*;

public class CreateAccountService {

    CreateAccountPage createAccountPage = new CreateAccountPage();
    LoginPageService loginPageService = new LoginPageService();
    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    public void createNewAccountFailed() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillEmailCreate(EMAIL_CREATE_FAILED)
                .clickCreateAnAccountButton();}

    public String getTextInvalidEmailMessage(){
        return loginPage.getTextInvalidEmailMessage();
    }


        public void createNewAccount () {
            loginPage.openPage(LOGIN_PAGE_URL)
                    .fillEmailCreate(EMAIL_CREATE)
                    .clickCreateAnAccountButton(); // нужно ожидание
            createAccountPage.clickTitle();
            createAccountPage.fillInFirstName(FIRST_NAME);
            createAccountPage.fillInLastName(LAST_NAME);
            createAccountPage.fillInPassword(PASSWORD_CREATE);
            createAccountPage.clickRegisterButton();
        }

        public String getTextPageName () {
            return loginPage.getTextMessageAboutCreating();


        }

    }
