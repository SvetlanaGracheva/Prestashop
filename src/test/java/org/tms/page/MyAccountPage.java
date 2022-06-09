package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {
    @FindBy(xpath = "//h1[contains(text(), 'My account')]")
    private WebElement pageName;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;  //сообщение аккаунт создан

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement pageTitleWomenButton;

    @FindBy(xpath = "//span[contains(text(), 'Add my first address')]")
    private WebElement nameAddMyFirstAddressButton; //добавить мой адрес


    public String getTextPageName() //получить название страницы
    {
        return pageName.getText();

    }

    public String getTextMessageAccountCreate() {
        return messageAccountCreate.getText();
    }// получить сообщение аккаунт создан

    public void clickPageTitleWomen() {
        pageTitleWomenButton.click();
    } // клик на страницу women
    public void clickNameAddMyFirstAddressButton(){
        nameAddMyFirstAddressButton.click();
    }
}
