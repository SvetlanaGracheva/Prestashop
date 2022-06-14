package org.tms.service;

import org.tms.page.CheckoutOrderPage;

public class CheckoutOrderPageService {
    WomenPageService womenPageService= new WomenPageService();
    AddressPageService addressPageService=new AddressPageService();
    CartPageService cartPageService= new CartPageService();
    CheckoutOrderPage checkoutOrderPage= new CheckoutOrderPage();

    public void order(){
        addressPageService.createYourAddress();
        womenPageService.addItemToCart();
        cartPageService.clickOnProceedToCheckoutButton();
        checkoutOrderPage.clickOnProceedToCheckoutButton();
        checkoutOrderPage.ChoosingTheTypeOfDelivery();
        checkoutOrderPage.clickOnProceedToCheckoutButtonAfterAgreementOfTermsOfServices();
        checkoutOrderPage.clickOnBankTransferButton();
        checkoutOrderPage.clickOnOrderConfirmationButton();

    }
    public String getTextOfOderConfirmationMessage (){
        return checkoutOrderPage.getTextOfOrderConfirmationMessage();
    }
    public void deleteAddress ()
    {addressPageService.deleteAddress();
    }
}

