package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {
    @FindBy(xpath = "//h1[contains(text(), 'My account')]")
    private WebElement pagename;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;//сообщение аккаунт создан

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement pageTitleWomenButton;


    public String getTextPageName() //получить название страницы
    {
        return pagename.getText();

    }

    public String getTextMessageAccountCreate() {
        return messageAccountCreate.getText();
    }// получить сообщение аккаунт создан

    public void clickPageTitleWomen() {
        pageTitleWomenButton.click();
    } // клик на страницу women
}
