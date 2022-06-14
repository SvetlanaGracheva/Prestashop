package org.tms.service;


import io.qameta.allure.Step;
import org.tms.page.CartPage;

public class CartPageService {
    private CartPage cartPage = new CartPage();

    @Step("Deleting item from cart")
    public void deleteItemFromCart() {
        cartPage.clickRemoveButton();
    }

    @Step("Getting count of items in the cart")
    public String getCountOfItemsInTheCart() {
        return cartPage.getCountOfItemsInTheCart();
    }

    @Step("Clicking on logout button")
    public void clickOnLogoutButton() {
        cartPage.clickOnLogoutButton();
    }
}
