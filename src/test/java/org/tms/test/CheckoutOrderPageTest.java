package org.tms.test;

import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.CheckoutOrderPageService;

import static org.tms.util.Constants.EXPECTED_MESSAGE_OF_CHECKOUT_PAGE;
//падает так какне создается адрес
public class CheckoutOrderPageTest extends BaseTest {

    CheckoutOrderPageService checkoutOrderPageService;

    @BeforeClass
    public void setUp(){
        checkoutOrderPageService=new CheckoutOrderPageService();
    }
    @Test
    public void checkoutOrderTest(){
        checkoutOrderPageService.order();
        String actualMessageOfCheckoutPage = checkoutOrderPageService.getTextOfOderConfirmationMessage();
        String expectedMessageOfCheckoutPage = EXPECTED_MESSAGE_OF_CHECKOUT_PAGE;

        Assert.assertTrue(actualMessageOfCheckoutPage.contains(expectedMessageOfCheckoutPage), "The actual text of checkout page does not match expected!");
    }
}
