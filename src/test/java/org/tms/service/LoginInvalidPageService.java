package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;

import static org.tms.util.Constants.*;

public class LoginInvalidPageService {
    protected User user = new User();
    protected LoginPage loginPage = new LoginPage();

    public LoginPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillinemailaddress(EMAIL)
                .fillinpassword(PASSWORD_FALSE)
                .clicksigninButton();
        return new LoginPage();


    }
}
