package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public class LoginPage extends Page {

    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 20);

    @FindBy(xpath = "//input[@id='email']") //авторизация почта
    private WebElement emailaddress;

    @FindBy(xpath = "//input[@id='passwd']") //авторизация пароль
    private WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']") //найти другой локатор  /
    private WebElement signinButton;

    @FindBy(xpath = "//input[@id='email_create']") //ввод адреса для регистрации
    private WebElement emailCreate;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement createAccountButton;

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
        emailCreate.clear();
        emailCreate.sendKeys(createemail);
        return this;
    }

    public void clickCreateanaccountButton() {
        createAccountButton.click();
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




