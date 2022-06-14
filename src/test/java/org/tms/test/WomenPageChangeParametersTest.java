package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.CartPage;
import org.tms.service.CartPageService;
import org.tms.service.WomenPageService;

public class WomenPageChangeParametersTest extends BaseTest {


   WomenPageService womenPageService;
   CartPageService cartPageService;
   CartPage cartPage;


    @BeforeClass
    public void setUp() {
            womenPageService= new WomenPageService();
            cartPageService= new CartPageService();
            cartPage= new CartPage();

    }

    @Test
   public void  changeTheCurrencyOnTheWebsiteTest(){
      womenPageService.changeTheCurrencyOnTheWebsite();
       String actualCurrencyName = womenPageService.getTitleCurrencyOnTheSite();
       String expectedCurrencyName= "EUR";
       Assert.assertEquals(actualCurrencyName,expectedCurrencyName,"The currency on the page is incorrect");

    }
    @Test
    public void changeTheLanguageOnTheWebsiteTest(){
        womenPageService.changeTheLanguageOnTheWebsite();
        String actualLanguageName= womenPageService.getTextLanguageOnTheSite();
        String expectedLanguageName= "Українська";
        Assert.assertEquals(actualLanguageName,expectedLanguageName,"The language on the page is incorrect");

    }
}