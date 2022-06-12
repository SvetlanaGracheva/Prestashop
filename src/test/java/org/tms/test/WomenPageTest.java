package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.CartPage;
import org.tms.service.CartPageService;
import org.tms.service.WomenPageService;

public class WomenPageTest extends BaseTest {

    // падает а локаторе //a[contains(text(), 'Евро')]

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
    // падает а локаторе //a[contains(text(), 'Евро')]
   public void  changeTheCurrencyOnTheWebsiteTest(){
      womenPageService.changeTheCurrencyOnTheWebsite();
       String actualCurrencyName = womenPageService.getTextCurrencyOnTheSite();
       String expectedCurrencyName= "EUR";
       Assert.assertEquals(actualCurrencyName,expectedCurrencyName,"The currency on the page is incorrect");

    }

    @Test  //падает на локаторе выбрать  язык //div[@class='current']//span[contains(text(), 'Українська')]}]
    public void changeTheLanguageOnTheWebsiteTest(){
        womenPageService.changeTheLanguageOnTheWebsite();
        String actualLanguageName= womenPageService.getTextLanguageOnTheSite();
        String expectedLanguageName= "Українська";
        Assert.assertEquals(actualLanguageName,expectedLanguageName,"The language on the page is incorrect");
    }
    @Test //написать добавить товар
    public void addItemToCartTest() {
        womenPageService.addItemToCart();
        String actualNameOfItemTheCart= womenPageService.getTitleItemInTheCart();
        cartPage.clickOnLogoutButton();
        String expectedNameOfItemTheCartText ="Printed Dress";
        Assert.assertEquals(actualNameOfItemTheCart,expectedNameOfItemTheCartText,"actual name");
    }


}
