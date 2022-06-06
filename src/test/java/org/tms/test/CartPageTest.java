package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.WomenPage;
import org.tms.service.WomenPageService;

public class CartPageTest extends BaseTest{
    //Нажать на товар  , Оформить заказ , переход на страницу заказ . ФР: наименование товара в корзине. ОР:

    WomenPageService womenPageService;

    @BeforeClass
    public void setUp(){
        womenPageService = new WomenPageService();}

        @Test (priority = 1)
                public void addItemCartToTest(){
            womenPageService.addItemToCart();
            String actualTitleOfItemTheCart= womenPageService.getTitleItemInTheCart();
            String expectedTitleOfItemTheCart= String.valueOf(00);
            Assert.assertTrue(actualTitleOfItemTheCart.contains(expectedTitleOfItemTheCart),"product not found");

                    }
    @Test (priority = 2) //удалить товар
    public void removeItemCartToTest(){}






}

