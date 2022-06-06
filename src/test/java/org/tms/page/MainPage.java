package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page{
    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")  // войти в аккаунт
    private WebElement singinButton;

    public void clicksigninButton(){
        singinButton.click();
    }


    public MainPage openPage (String url){
        driver.get(url);
        return this;
    }
}
