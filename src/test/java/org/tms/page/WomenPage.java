package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public class WomenPage extends Page {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 20);

    @FindBy(xpath = "//div[@class='button-container']//a[@data-id-product='3']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='right-block']")
    private WebElement element;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "////a[@rel='nofollow']//span[@class='ajax_cart_quantity']")
    private WebElement cartButton;

    @FindBy(xpath = " //a[@title='Printed Dress']//ancestor::div[@class='right-block']//span[@itemprop='price']")
    private WebElement priceOfItem;


    @FindBy(xpath = "//span[contains(text(), 'Валюта :')]")
    private WebElement currencyListButton;

    @FindBy(xpath = "//a[contains(text(), 'Евро')]")
    private WebElement currencySelectionButton; //выбор валюты

    @FindBy(xpath = "//span[contains(text(), '€')]")
    private WebElement currencyPresenceOnThePage;//наличие валюты на странице

    @FindBy(xpath = "//span[contains(text(), '€')]")
    private WebElement currencyOnTheSite; //валюта сайта , строка сверху

    @FindBy(xpath = "//div[@id='languages-block-top']")
    private WebElement languageListButton;

    @FindBy(xpath = "//span[contains(text(), 'Українська')]")
    private WebElement languageSelectionButton; //выбор язвка

    @FindBy(xpath = " //div[@class='current']//span[contains(text(), 'Українська')]")
    private WebElement languageOnTheSite;

    @FindBy(xpath = "//b[contains(text(), 'Кошик:')]")
    private WebElement languagePresenceOnThePage;//наличие языка на странице


    public void clickCurrencyListButton() {
        currencyListButton.click();// клик список валюты
    }

    public void clickCurrencySelectionButton() {
        currencySelectionButton.click(); //валюта
    }

    public String getTextСurrencyPresenceOnThePage() {
        return currencyPresenceOnThePage.getText(); //валюта на страницк
    }

    public String getTextCurrencyOnTheSite() {
        return currencyOnTheSite.getText(); //валюта на сайте сврху строка
    }

    public void clickLanguageListButton() {
        languageListButton.click();
    }

    public void clickLanguageSelection() {
        languageSelectionButton.click();
    }

    public String getTextLanguageOnTheSite() {
        return languageOnTheSite.getText();
    }

    public String getTextLanguagePresenceOnThePage() {
        return languagePresenceOnThePage.getText();
    }

    public WomenPage clickToAddToCartButton() {
        //log.info("Clicking on the add to the cart button");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(addToCartButton).click().build().perform();
        return this;
    }

    public WomenPage clickToContinueShoppingButton() {
        //log.info("Clicking on the continue to shopping button");
        wait.until(ExpectedConditions.visibilityOf(continueShoppingButton)).click();
        continueShoppingButton.click();
        return this;
    }

    public void clickToCartButton() {
       // log.info("Clicking on the cart button");
        cartButton.click();
    }

    public String getPriceOfItem() {
       // log.info("Getting price of item");
        return priceOfItem.getText();
    }
}
