package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;
import org.tms.util.Waiter;

@Log4j2
public class MyAccountPage extends Page {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 10);

    @FindBy(xpath = "//p[contains(text(), 'Welcome to your account. Here you can manage all of your personal information and orders.')]")
    private WebElement pageNameAccount;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;


    @FindBy(xpath = "//a[@title='Women']")
    private WebElement pageTitleWomenButton;

    @FindBy(xpath = "//span[contains(text(), 'Add my first address')]")
    private WebElement nameAddMyFirstAddressButton;

    @FindBy(xpath = "//div[@class='header_user_info']//a[@class='logout']")
    private WebElement signOutButton;

    @FindBy(xpath = "//div[@id='languages-block-top']")
    private WebElement languageListButton;

    @FindBy(xpath = "//span[contains(text(), 'Українська')]")
    private WebElement languageSelectionButton; //выбор язвка

    @FindBy(xpath = " //div[@class='current']//span[contains(text(), 'Українська')]")
    private WebElement languageOnTheSite;

    @FindBy(xpath = "//span[contains(text(), 'Валюта :')]")
    private WebElement currencyListButton;

    @FindBy(xpath = "//a[contains(text(), 'Евро')]")
    private WebElement currencySelectionButton; //выбор валюты

    @FindBy(xpath = "//strong[contains(text(), 'EUR')]")
    private WebElement currencyOnTheSite;

    public String getTextPageNameAccount()
    {
        log.info("Getting the page name");
        return pageNameAccount.getText();
    }

    public String getTextMessageAccountCreate() {
        log.info("Getting message Account Create");
        return messageAccountCreate.getText();
    }

    public void clickPageTitleWomen() {
        log.info("Clicking button title Women");
        pageTitleWomenButton.click();
    }

    public void clickNameAddMyFirstAddressButton() {
        log.info("Clicking the Add My First Address button");
        nameAddMyFirstAddressButton.click();
    }
    public void clickSignOutButton() {
                log.info("Clicking button sign out");
        Waiter.waitVisibilityOfElement(driver, signOutButton);
        signOutButton.click();
    }
    public void clickLanguageListButton() {
        log.info("Clicking the language list");
        languageListButton.click();
    }

    public void clickLanguageSelection() {
        log.info("Clicking on the language select");
        Waiter.waitVisibilityOfElement(driver, languageSelectionButton);
        languageSelectionButton.click();
    }

    public String getTextLanguageOnTheSite() {
        log.info("Getting language received on the top line");
        return languageOnTheSite.getText();
    }

    public void clickCurrencyListButton() {
        log.info("Clicking the currency list");
        currencyListButton.click();// клик список валюты
    }

    public void clickCurrencySelectionButton() {
        log.info("Clicking on the currency select");
        Waiter.waitVisibilityOfElement(driver, currencySelectionButton);
        currencySelectionButton.click(); //валюта
    }


    public String getTextCurrencyOnTheSite() {
        log.info("Getting currency received on the top line");
        return currencyOnTheSite.getText();
    }

}
