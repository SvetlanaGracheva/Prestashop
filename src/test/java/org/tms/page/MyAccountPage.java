package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {

    @FindBy(xpath = "//h1[contains(text(), 'My account')]") // вход успешен //p[contains(text(), 'Your account has been created.')]
    private WebElement pagename;

    public String getTextPageName (){
        return pagename.getText();

    }
}
