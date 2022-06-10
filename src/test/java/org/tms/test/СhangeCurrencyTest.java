package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.LoginPage;
import org.tms.page.MyAccountPage;
import org.tms.service.LoginPageService;
import org.tms.service.WomenPageService;

public class СhangeCurrencyTest extends BaseTest {

    // падает а локаторе //a[contains(text(), 'Евро')]

   WomenPageService womenPageService;

    @BeforeClass
    public void setUp() {
            womenPageService= new WomenPageService();

    }

    @Test //падает на локаторе выбрать  язык //div[@class='current']//span[contains(text(), 'Українська')]}]
   public void  changeTheCurrencyOnTheWebsiteTest(){
      womenPageService.changeTheCurrencyOnTheWebsite();
       String actualCurrencyName = womenPageService.getTextСurrencyPresenceOnThePage();
       String expectedCurrencyName= womenPageService.getTextCurrencyOnTheSite();
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
