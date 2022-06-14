package org.tms.service;

import org.tms.page.CartPage;
import org.tms.page.MyAccountPage;
import org.tms.page.WomenPage;

public class WomenPageService {
    WomenPage womenPage=new WomenPage();
    LoginPageService loginPageService= new LoginPageService();
    MyAccountPage myAccountPage= new MyAccountPage();
    CartPage cartPage= new CartPage();

    public String addItemToCart(){
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
         womenPage.clickToContinueShoppingButton();
                return womenPage.getPriceOfItem();


    }
    public String getTitleItemInTheCart(){
        return cartPage.descriptionItemInTheCart();
    }

    public WomenPageService changeTheCurrencyOnTheWebsite() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickCurrencyListButton();
        womenPage.clickCurrencySelectionButton();
        return new WomenPageService();



    }
        public String getTitleCurrencyOnTheSite(){
        return womenPage.getTextCurrencyOnTheSite();
    }

    public void changeTheLanguageOnTheWebsite() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickLanguageListButton();
        womenPage.clickLanguageListButton();
    }

    public String getTextLanguageOnTheSite(){
        return womenPage.getTextLanguageOnTheSite();
    }
}
