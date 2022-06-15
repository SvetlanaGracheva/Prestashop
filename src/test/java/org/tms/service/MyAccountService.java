package org.tms.service;

import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;

public class MyAccountService {

    LoginPageService loginPageService = new LoginPageService();
    MyAccountPage myAccountPage = new MyAccountPage();
    LoginPage loginPage = new LoginPage();

    public LoginPageService changeTheLanguageOnTheWebsite() {
        loginPageService.login();
        myAccountPage.clickLanguageListButton();
        myAccountPage.clickLanguageSelection();
        myAccountPage.clickSignOutButton();
        return new LoginPageService();
    }

    public String getTextLanguageOnTheSite() {
        return myAccountPage.getTextLanguageOnTheSite();
    }

    public LoginPageService changeTheCurrencyOnTheWebsite() {
        loginPageService.login();
        myAccountPage.clickCurrencyListButton();
        myAccountPage.clickCurrencySelectionButton();
        myAccountPage.clickSignOutButton();
        return new LoginPageService();


    }

    public String getTitleCurrencyOnTheSite() {
        return myAccountPage.getTextCurrencyOnTheSite();
    }

}


