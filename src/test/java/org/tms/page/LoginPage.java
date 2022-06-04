package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailaddress;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']") //найти другой локатор
    private WebElement singinButton;

    public LoginPage fillinemailaddress(String addresemail) {
        emailaddress.clear();
        emailaddress.sendKeys(addresemail);
        return this;

        public LoginPage fillinpassword (String keyPassword){
            password.clear();
            password.sendKeys(keyPaswod);

        }


    }
