package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Page {
    @FindBy(xpath = "//a[@data-id-product='3']//span[contains(text(), 'Add to cart')]")
    private WebElement addToCartButton;// добавить товар в корзину

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span[contains(text(), 'Оформить заказ')]")
    private WebElement placeAnOrderButton; // кнопка оформить заказ


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


    public void clickToCardButton() {
        addToCartButton.click();// клик на товар
    }

       public void clickPlaceAnOrderButton(){
        placeAnOrderButton.click(); // клик оформить товар
    }

    public void clickCurrencyListButton(){
        currencyListButton.click();// клик список валюты
    }
    public void clickCurrencySelectionButton(){
        currencySelectionButton.click(); //валюта
    }
    public String getTextСurrencyPresenceOnThePage() {
        return currencyPresenceOnThePage.getText(); //валюта на страницк
    }

    public String getTextCurrencyOnTheSite() {
        return currencyOnTheSite.getText(); //валюта на сайте сврху строка
    }
    public void clickLanguageListButton(){
        languageListButton.click();}

    public void clickLanguageSelectionButton(){
       languageSelectionButton.click();}

    public String getTextLanguageOnTheSite() {
        return languageOnTheSite.getText();}

    public String getTextLanguagePresenceOnThePage() {
        return languagePresenceOnThePage.getText();
    }



}
