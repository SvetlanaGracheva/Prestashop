package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.CartPageService;
import org.tms.service.WomenPageService;

public class CartPageTest extends BaseTest{
    private WomenPageService womenPageService;
    private CartPageService cartPageService;

    @BeforeClass
    public void setUp() {
        womenPageService= new WomenPageService();
        cartPageService = new CartPageService();
    }

    @Test
    public void addItemToCartTest() {
        womenPageService.addItemToCart();
        String actualNameOfItemItTheCart = womenPageService.getTitleItemInTheCart();
        cartPageService.clickOnLogoutButton();
        String expectedNameOfItemItTheCart = "Faded Short Sleeve T-shirts";
        Assert.assertTrue(actualNameOfItemItTheCart.contains(expectedNameOfItemItTheCart), "The actual name of item in the cart does not match expected!");
    }

}
