package org.tms.service;

import io.qameta.allure.Step;
import org.tms.page.CartPage;
import org.tms.page.MyAccountPage;
import org.tms.page.WomenPage;

public class WomenPageService {
    WomenPage womenPage = new WomenPage();
    LoginPageService loginPageService = new LoginPageService();
    MyAccountPage myAccountPage = new MyAccountPage();
    CartPage cartPage = new CartPage();

    @Step("Add item to cart")
    public void addItemToCart() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
        womenPage.clickToContinueShoppingButton();
        womenPage.clickToCartButton();
    }

    public String getTitleItemInTheCart() {
        return cartPage.descriptionItemInTheCart();
    }


}