package org.tms.service;

import io.qameta.allure.Step;
import org.tms.page.CartPage;
import org.tms.page.MyAccountPage;
import org.tms.page.WomenPage;

public class WomenPageService {
    WomenPage womenPage=new WomenPage();
    LoginPageService loginPageService= new LoginPageService();
    MyAccountPage myAccountPage= new MyAccountPage();
    CartPage cartPage= new CartPage();

    @Step ("Add item to cart")
    public void addItemToCart() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
        womenPage.clickToContinueShoppingButton();
        womenPage.clickToCartButton();
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

    public WomenPageService changeTheLanguageOnTheWebsite() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickLanguageListButton();
        womenPage.clickLanguageListButton();
        return new WomenPageService();
    }

    public String getTextLanguageOnTheSite(){
        return womenPage.getTextLanguageOnTheSite();
    }
}
