package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.MainPage;

import static org.tms.util.Constants.*;

public class LoginInvalidPageService {
    protected MainPage mainPage = new MainPage();
    protected User user = new User();
    protected LoginPage loginPage = new LoginPage();

    public LoginPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillinemailaddress(EMAIL)
                .fillinpassword(PASSWORDFALSE)
                .clicksigninButton();
        return new LoginPage();
    }
}
