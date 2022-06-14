package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class MyAccountPage extends Page {
    @FindBy(xpath = "//p[contains(text(), 'Welcome to your account. Here you can manage all of your personal information and orders.')]")
    private WebElement pageNameAccount;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;


    @FindBy(xpath = "//a[@title='Women']")
    private WebElement pageTitleWomenButton;

    @FindBy(xpath = "//span[contains(text(), 'Add my first address')]")
    private WebElement nameAddMyFirstAddressButton; //добавить мой адрес


    public String getTextPageNameAccount()
    {
        log.info("Getting the page name");
        return pageNameAccount.getText();
    }

    public String getTextMessageAccountCreate() {
        log.info("Getting message Account Create");
        return messageAccountCreate.getText();
    }// получить сообщение аккаунт создан

    public void clickPageTitleWomen() {
        log.info("Clicking button title Women");
        pageTitleWomenButton.click();
    } // клик на страницу women

    public void clickNameAddMyFirstAddressButton() {
        log.info("Clicking the Add My First Address button");
        nameAddMyFirstAddressButton.click();
    }
}
