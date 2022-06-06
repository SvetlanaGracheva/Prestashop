package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    @FindBy(xpath = "//input[@id='email']") //авторизация почта
    private WebElement emailaddress;

    @FindBy(xpath = "//input[@id='passwd']") //авторизация пароль
    private WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']") //найти другой локатор  /
    private WebElement signinButton;

    @FindBy(xpath = "//input[@id='email_create']") //ввод адреса для регистрации
    private WebElement emailcreate;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement createanaccountButton;

    @FindBy(xpath = "//li[contains(text(), 'Authentication failed.')]")
    private WebElement authenticationfailed;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }


    public LoginPage fillinemailaddress(String addresemail) {
        emailaddress.clear();
        emailaddress.sendKeys(addresemail);
        return this;
    }

    public LoginPage fillinpassword(String keyPassword) {
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clicksigninButton() {
        signinButton.click();
    }

    public LoginPage fillemailcreate(String createemail) {
        emailcreate.clear();
        emailcreate.sendKeys(createemail);
        return this;
    }

    public void clickcreateanaccountButton() {
        createanaccountButton.click();
    }

    public String getTextAuthenticationFailed() {
        return authenticationfailed.getText();
    }
    @FindBy(xpath = "//h1[contains(text(), 'Authentication')]") // вход с неверным паролем
    private WebElement mainObjectOfMyAccountPage;

    public String getTextOfNameOfMainPageSection (){
        return mainObjectOfMyAccountPage.getText();

    }
}




