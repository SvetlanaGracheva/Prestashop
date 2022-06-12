package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;

import static org.tms.util.Constants.*;

public class LoginPageService {


    protected LoginPage loginPage = new LoginPage();
    protected User user = new User();

    public MyAccountPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillinemailaddress(EMAIL)
                .fillinpassword(PASSWORD)
                .clicksigninButton();
        return new MyAccountPage();
    }
}
