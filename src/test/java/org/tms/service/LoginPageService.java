package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;

import static org.tms.util.Constants.*;

public class LoginPageService {


    protected LoginPage loginPage = new LoginPage();
    protected User user = new User();
    protected MyAccountPage myAccountPage= new MyAccountPage();

    public MyAccountPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInEmailAddress(EMAIL)
                .fillInPassword(PASSWORD_CREATE)
                .clickSignInButton();
        return new MyAccountPage();
    }

    public LoginPage signOut(){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInEmailAddress(EMAIL)
                .fillInPassword(PASSWORD_CREATE)
                .clickSignInButton();
        myAccountPage.clickSignOutButton();
        return new LoginPage();
    }


}
