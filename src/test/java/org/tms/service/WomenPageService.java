package org.tms.service;

import org.tms.page.CartPage;
import org.tms.page.MyAccountPage;
import org.tms.page.WomenPage;

public class WomenPageService {
    WomenPage womenPage=new WomenPage();
    LoginPageService loginPageService= new LoginPageService();
    MyAccountPage myAccountPage= new MyAccountPage();
    CartPage cartPage= new CartPage();

    public void addItemToCart(){
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToCardButton();
        womenPage.clickPlaceAnOrderButton();

    }
    public String getTitleItemInTheCart(){
        return cartPage.descriptionItemInTheCart();
    }
}
