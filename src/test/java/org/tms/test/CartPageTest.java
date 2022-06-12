package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.WomenPage;
import org.tms.service.CartPageService;
import org.tms.service.WomenPageService;

public class CartPageTest extends BaseTest {
    //Нажать на товар  , Оформить заказ , переход на страницу заказ . ФР: наименование товара в корзине. ОР:

    WomenPageService womenPageService;
    CartPageService cartPageservice;

    @BeforeClass
    public void setUp() {
        womenPageService = new WomenPageService();
        cartPageservice = new CartPageService();
            }

    @Test //удалить товар
    public void removeItemCartToTest() {
        womenPageService.addItemToCart();
        cartPageservice.deleteItemFromCart();


    }


}

