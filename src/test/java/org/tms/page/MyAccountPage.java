package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {
    @FindBy(xpath = "//h1[contains(text(), 'My account')]")
    private WebElement pagename;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;//сообщение аккаунт создан

    public String getTextPageName (){
        return pagename.getText();

    }
    public String getTextMessageAccountCreate(){
        return messageAccountCreate.getText();
    }
}