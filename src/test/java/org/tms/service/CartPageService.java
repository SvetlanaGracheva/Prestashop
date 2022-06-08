package org.tms.service;

import org.tms.page.CartPage;

public class CartPageService {
    CartPage cartPage=new CartPage();

public void deleteItemFromCart(){
    cartPage.clickRemoveButton();
}
}
