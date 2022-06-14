package org.tms.test;

import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.CheckoutOrderPageService;

import static org.tms.util.Constants.EXPECTED_MESSAGE_OF_CHECKOUT_PAGE;
//падает так какне создается адрес
public class CheckoutOrderPageTest extends BaseTest {

    private CheckoutOrderPageService checkoutOrderPadeService;

    @BeforeClass
    public void setUp() {
        checkoutOrderPadeService = new CheckoutOrderPageService();
    }

    @Test
    public void checkoutOrderTest() {
        checkoutOrderPadeService.order();
        String actualMessageOfCheckoutPage = checkoutOrderPadeService.getTextOfOderConfirmationMessage();
        String expectedMessageOfCheckoutPage = "ORDER CONFIRMATION";
        checkoutOrderPadeService.deleteAddress();
        Assert.assertTrue(actualMessageOfCheckoutPage.contains(expectedMessageOfCheckoutPage), "The actual text of checkout page does not match expected!");
    }
}