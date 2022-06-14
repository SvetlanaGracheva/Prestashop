package org.tms.service;

import org.openqa.selenium.Alert;
import org.tms.driver.DriverSingleton;
import org.tms.page.AddressPage;
import org.tms.page.MyAccountPage;

import static org.tms.util.Constants.*;

public class AddressService {
    AddressPage addressPage=new AddressPage();
    LoginPageService loginPageService=new LoginPageService();
    MyAccountPage myAccountPage=new MyAccountPage();


    public void createYourAddressErrors(){
        loginPageService.login();
        myAccountPage.clickNameAddMyFirstAddressButton();
        addressPage.fillInFirstName(FIRST_NAME)
                .fillInLastName(LAST_NAME)
                .fillAddress(ADDRESS)
                .fillInZipCode(ZIPCODE)
                .fillInCity(CITY)
                .fillInPhoneHome(HOME_PHONE)
                .fillInPhoneMobile(MOBILE_PHONE)
                .clickSaveAddressButton();
    }

    public String getTheTextAddressError(){
        return addressPage.getTheTextAddressError();
    }

    public void createYourAddress(){
        loginPageService.login();
        myAccountPage.clickNameAddMyFirstAddressButton();
        addressPage.fillInFirstName(FIRST_NAME)
                .fillInLastName(LAST_NAME)
                .fillAddress(ADDRESS)
                .fillInZipCode(ZIPCODE)
                .fillInCity(CITY)
                .fillInPhoneHome(HOME_PHONE)
                .fillInPhoneMobile(MOBILE_PHONE)
                .clickDropDownListButton();
        addressPage.fillInState(STATE);//ЗДЕСЬ ПАДАЕТ , здесь не клик а выбор по  букве
        addressPage.clickSaveAddressButton();

    }

    public String getTheNameAboutCreatingNewAddress(){
        return addressPage.getTheTextAboutCreatingNewAddress();
    }

    public String getTheTitleBlockNameMyAddress(){
        return addressPage.getTheTextAboutCreatingNewAddress();
    }

    Alert alert;

    public void deleteAddress() {
        addressPage.openPage(PAGE_URL_ADDRESS)
                .clickDeleteAddressButton();
        alert = DriverSingleton.getDriver().switchTo().alert();
        alert.accept();
    }

    public String getTextOfPageAfterDeleteAddress() {
        return addressPage.getText();
    }
}
