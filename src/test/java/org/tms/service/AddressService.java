package org.tms.service;

import org.tms.page.AddressPage;
import org.tms.page.MyAccountPage;

import static org.tms.util.Constants.*;

public class AddressService {
    AddressPage addressPage=new AddressPage();
    LoginPageService loginPageService=new LoginPageService();
    MyAccountPage myAccountPage=new MyAccountPage();


    public void createYourAddress(){
        loginPageService.login();
        myAccountPage.clickNameAddMyFirstAddressButton();
        addressPage.fillInFirstName(FIRSTNAME)
                .fillInLastName(LASTNAME)
                .fillAddress(ADDRESS)
                .fillInZipCode(ZIPCODE)
                .fillInCity(CITY)
                .fillInPhoneHome(HOMEPHONE)
                .fillInPhoneMobile(MOBILEPHONE)
                .clickDropDownListButton();
                addressPage.clickNameStateButton();
                addressPage.clickSaveAddressButton();


    }
    public String getTheNameAboutCreatingNewAddress(){
       return addressPage.getTheTextAboutCreatingNewAddress();
           }

           public String getTheTitleBlockNameMyAddress(){
       return addressPage.getTheTextAboutCreatingNewAddress();
           }
}
