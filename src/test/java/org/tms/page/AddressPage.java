package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddressPage extends Page {
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneHome;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement phoneMobile;

    @FindBy(xpath = "//div[@id='uniform-id_state']")
    private WebElement stateButton;

    @FindBy(xpath = "//select[@id='id_state']//option[@value='337']")
    private WebElement stateNameButton; //здесь падает , нужен ввод буквы А

    @FindBy(xpath = "//button[@id='submitAddress']")
    private WebElement saveAddressButton;

    @FindBy(xpath = "//p[contains(text(), 'There are 3 errors ')]")
    private WebElement  errorsAddress;

    @FindBy(xpath = "//strong[contains(text(), 'Your addresses are listed below.')]")
    private WebElement messageAddress;

    @FindBy(xpath = "//h3[contains(text(), 'My address')]")
    private WebElement blockNameMyAddress;

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement availableAddressesButton;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logoutButton;


    public AddressPage openPage(String url) {
        //log.info("Open address page by URL");
        driver.get(url);
        return this;
    }

    public AddressPage fillInFirstName(String firstNameString) {
        firstName.clear();
        firstName.sendKeys(firstNameString);
        return this;
    }

    public AddressPage fillInLastName(String lastNameString) {
        lastName.clear();
        lastName.sendKeys(lastNameString);
        return this;
    }

    public AddressPage fillAddress(String addressString) {
        address.clear();
        address.sendKeys(addressString);
        return this;
    }


    public AddressPage fillInZipCode(String zipCodeString) {
        zipcode.clear();
        zipcode.sendKeys(zipCodeString);
        return this;
    }

    public AddressPage fillInCity(String cityString) {
        city.clear();
        city.sendKeys(cityString);
        return this;
    }

    public AddressPage fillInPhoneHome(String phoneHomeString) {
        phoneHome.clear();
        phoneHome.sendKeys(phoneHomeString);
        return this;
    }

    public AddressPage fillInPhoneMobile(String phoneMobileString) {
        phoneMobile.clear();
        phoneMobile.sendKeys(phoneMobileString);
        return this;
    }

    public void clickDropDownListButton() {
        stateButton.click();
    }

    public void clickNameStateButton(String state) {
        stateNameButton.click();
    }

    public void clickSaveAddressButton() {
        saveAddressButton.click();
    }

    public String getTheTextAddressError() {
        return errorsAddress.getText(); // сообщение о создании адресе
    }


    public String getTheTextAboutCreatingNewAddress() {
        return messageAddress.getText(); // сообщение о создании адресе

    }
    public String getTheTextBlockNameMyAddress() {
        return blockNameMyAddress.getText(); // текст о наличии блоа  адрес

}
    public void clickDeleteAddressButton() {
        deleteAddressButton.click();
    }
    public String getText() {
        //log.info("Getting text from the button (for assert)");
        return availableAddressesButton.getText();
    }


    public void clickOnLogoutButton() {
       // log.info("Clicking on the logout button");
        logoutButton.click();
    }
}



