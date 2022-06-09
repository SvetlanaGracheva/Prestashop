package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddressPage extends Page {
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address1;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneHome;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement phoneMobile;

    @FindBy(xpath = "//select[@id='id_state']")
    private WebElement stateButton;

    @FindBy(xpath = "//select[@id='id_state']//option[@value='337']")
    private WebElement stateNameButton;

    @FindBy(xpath = "//button[@id='submitAddress']")
    private WebElement saveAddressButton;

    @FindBy(xpath = "//strong[contains(text(), 'Your addresses are listed below.')]")
    private WebElement messageAddress;

    @FindBy(xpath = "//h3[contains(text(), 'My address')]")
    private WebElement blockNameMyAddress;


    public AddressPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public AddressPage fillInFirstName(String firstnamestring) {
        firstName.clear();
        firstName.sendKeys(firstnamestring);
        return this;
    }

    public AddressPage fillInLastName(String lastNamestring) {
        firstName.clear();
        firstName.sendKeys(lastNamestring);
        return this;
    }

    public AddressPage fillAddress(String addressstring) {
        address1.clear();
        address1.sendKeys(addressstring);
        return this;
    }


    public AddressPage fillInZipCode(String zipcodestring) {
        firstName.clear();
        firstName.sendKeys(zipcodestring);
        return this;
    }

    public AddressPage fillInCity(String citystring) {
        firstName.clear();
        firstName.sendKeys(citystring);
        return this;
    }

    public AddressPage fillInPhoneHome(String phoneHomestring) {
        firstName.clear();
        firstName.sendKeys(phoneHomestring);
        return this;
    }

    public AddressPage fillInPhoneMobile(String phoneMobilestring) {
        firstName.clear();
        firstName.sendKeys(phoneMobilestring);
        return this;
    }

    public void clickDropDownListButton() {
        stateButton.click();
    }

    public void clickNameStateButton () {
        stateNameButton.click();
    }

    public void clickSaveAddressButton() {
        saveAddressButton.click();
    }

    public String getTheTextAboutCreatingNewAddress() {
        return messageAddress.getText(); // сообщение о создании адресе

    }
    public String getTheTextBlockNameMyAddress() {
        return blockNameMyAddress.getText(); // текст о наличии блоа  адрес

}}



