package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Page {
    @FindBy(xpath = "//input[@id='id_gender2']") //гр-н или г-жа
    private WebElement title;

    @FindBy(xpath = "//input[@id='customer_firstname']")// имя
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordcreate;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement dateofbirthdays;

    @FindBy(xpath = "//select[@id='days']//option[@value='17']") //выбор даты рождения
    private WebElement dateofbirthdayschoice;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement dateofbirthmonths;

    @FindBy(xpath = "//select[@id='months']//option[@value='7']")
    private WebElement dateofbirthmonthschoice;

    @FindBy(xpath = "//div[@id='cuselFrame-years']")
    private WebElement dateofbirthyears;

    @FindBy(xpath = "//div[@id='cusel-scroll-years']//span[@val='1988']")
    private WebElement dateofbirthyearschoice;

    @FindBy(xpath = "///input[@id='newsletter']")
    private WebElement checkboxnewsletter;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement checkboxoffers;

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

    public void clickdateofbirthdaysButton() {
        dateofbirthdays.click();
    }

    public void clickdateofbirthdayschoice() {
        dateofbirthdayschoice.click();
    }
    public void clickdateofbirthmonthsButton() {
        dateofbirthmonths.click();
    }
    public void clickdateofbirthmonthschoice() {
        dateofbirthmonthschoice.click();
    }
    public void clickdateofbirthyears() {
        dateofbirthyears.click();
    }
    public void clickdateofbirthyearschoice(){
        dateofbirthyearschoice.click();
    }
    public void clickcheckboxnewsletter(){
        checkboxnewsletter.click();
    }
    public void clickcheckboxoffers(){
        checkboxoffers.click();
    }
    public void clickregisterButton(){
        registerButton.click();
    }

}
