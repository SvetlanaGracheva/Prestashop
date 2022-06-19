package org.tms.service;

import io.qameta.allure.Step;
import org.tms.driver.DriverSingleton;
import org.tms.page.AddressPage;
import org.openqa.selenium.Alert;
import org.tms.model.Address;

import static org.tms.model.Address.ADDRESSES_PAGE_URL;
import static org.tms.model.Address.ADDRESS_PAGE_URL;

public class AddressPageService {
    private AddressPage addressPage = new AddressPage();
    private LoginPageService loginPageService = new LoginPageService();

    Alert alert;


    @Step("Creating address")
    public void createYourAddress() {
        loginPageService.login();
        Address address = new Address();
        addressPage.openPage(ADDRESS_PAGE_URL)
                .firstNameInput(address)
                .lastNameInput(address)
                .addressInput(address)
                .zipInput(address)
                .cityInput(address)
                .chooseACountry(address)
                .homePhoneInput(address)
                .chooseAState(address)
                .addressTitleInput(address)
                .clickSaveButton();
    }

    @Step("Clicking on logout button")
    public void clickOnLogoutButton() {
        addressPage.clickOnLogoutButton();
    }

    @Step("Getting title of address page")
    public String getTitleOfAddressPage() {
        return addressPage.getTextOfNameOfAddress();
    }

    @Step("Deleting address")
    public void deleteAddress() {
        addressPage.openPage(ADDRESSES_PAGE_URL)
                .clickDeleteAddressButton();
        alert = DriverSingleton.getDriver().switchTo().alert();
        alert.accept();
    }

    @Step("Getting text of the page after deleting address")
    public String getTextOfPageAfterDeleteAddress() {
        return addressPage.getText();
    }


}

