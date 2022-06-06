package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.MainPage;
import org.tms.page.MyAccountPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "http://prestashop.qatestlab.com.ua/en/";

    protected LoginPage loginPage= new LoginPage();
    protected MainPage mainPage=new MainPage();
        protected User user= new User();

    public MyAccountPage login(){
        mainPage.openPage(LOGIN_PAGE_URL);
        mainPage.clicksigninButton();
        loginPage.fillinemailaddress(user.getEmailaddress())
                .fillinpassword(user.getPassword())
                .clicksigninButton();
        return new MyAccountPage();
    }


}
