package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.MainPage;
import org.tms.page.MyAccountPage;

public class LoginPageFalseService {
    private static final String LOGIN_PAGE_URL = "http://prestashop.qatestlab.com.ua/en/";

    protected MainPage mainPage=new MainPage();
    protected User user= new User();
    protected LoginPage loginPage= new LoginPage();

    public LoginPage login(){
        mainPage.openPage(LOGIN_PAGE_URL)
                .clicksigninButton();
        loginPage.fillinemailaddress(user.getEmailaddress())
                .fillinpassword(user.getPasswordfalse())
                .clicksigninButton();
        return new LoginPage();
    }


}
