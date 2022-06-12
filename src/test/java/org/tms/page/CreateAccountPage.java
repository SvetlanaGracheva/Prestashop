package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public class CreateAccountPage extends Page {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 15);

    @FindBy(xpath = "//input[@id='id_gender2']") //гр-н или г-жа
    private WebElement title;

    @FindBy(xpath = "//input[@id='customer_firstname']")// имя
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordcreate;


    @FindBy(xpath = "//span[contains(text(), 'Register')]")
    private WebElement registerButton;

    public void clicktitle() {
        title.click();
    }

    public CreateAccountPage fillinfirstname(String firstnamestring) {
        firstname.clear();
        firstname.sendKeys(firstnamestring);
        return this;
    }

    public CreateAccountPage fillinlastname(String lastnamestring) {
        lastname.clear();
        lastname.sendKeys(lastnamestring);
        return this;
    }

    public CreateAccountPage fillinpassword(String passwordstring) {
        passwordcreate.clear();
        passwordcreate.sendKeys(passwordstring);
        return this;
    }

       public void clickRegisterButton(){
        registerButton.click();
    }

}
