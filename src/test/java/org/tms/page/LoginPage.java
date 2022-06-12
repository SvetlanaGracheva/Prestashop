package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

@Log4j2
public class LoginPage extends Page {

    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 20);

    @FindBy(xpath = "//input[@id='email']") //авторизация почта
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='passwd']") //авторизация пароль
    private WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']") //найти другой локатор  /
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']") //ввод адреса для регистрации
    private WebElement emailCreate;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//li[contains(text(), 'Authentication failed.')]")
    private WebElement authenticationFailed;

    @FindBy(xpath = "//h1[contains(text(), 'Authentication')]") // вход с неверным паролем
    private WebElement mainObjectOfMyAccountPage;

    @FindBy(xpath = "//li[contains(text(), 'Invalid email address.')]") // вход с неверным паролем
    private WebElement invalidEmailMessage;

    public LoginPage openPage(String url) {
        log.info("Opening page by URL");
        driver.get(url);
        return this;
    }


    public LoginPage fillInEmailAddress(String addressEmail) {
        log.info("Entering email address");
        emailAddress.clear();
        emailAddress.sendKeys(addressEmail);
        return this;
    }

    public LoginPage fillInPassword(String keyPassword) {
        log.info("Entering  password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clickSignInButton() {
        log.info("Clicking the sing in button");
        signInButton.click();
    }

    public LoginPage fillEmailCreate(String createEmail) {
        log.info("Entering email address to create");
        emailCreate.clear();
        emailCreate.sendKeys(createEmail);
        return this;
    }

    public void clickCreateAnAccountButton() {
        log.info("Clicking the button create");
        wait.until(ExpectedConditions.visibilityOf(createAccountButton)).click();
        createAccountButton.click();
    }

    public String getTextAuthenticationFailed() {
        log.info("Getting a text about an invalid entry");
        return authenticationFailed.getText();
    }


    public String getTextOfNameOfMainPageSection (){
        log.info("Getting name page");
        return mainObjectOfMyAccountPage.getText();

    }

    public String getTextInvalidEmailMessage(){
        log.info("Getting message invalid email");
        return invalidEmailMessage.getText();

    }

}




