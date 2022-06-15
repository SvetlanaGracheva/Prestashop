package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;
import org.tms.util.Waiter;

@Log4j2
public class WomenPage extends Page {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 10);

    @FindBy(xpath = "//div[@class='button-container']//a[@data-id-product='1']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='right-block']")
    private WebElement element;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "////a[@rel='nofollow']//span[@class='ajax_cart_quantity']")
    private WebElement cartButton;

    @FindBy(xpath = " //a[@title='Printed Dress']//ancestor::div[@class='right-block']//span[@itemprop='price']")
    private WebElement priceOfItem;

    public void clickToAddToCartButton() {
        log.info("Clicking on the add to the cart button");
        Waiter.waitVisibilityOfElement(driver, addToCartButton);
        addToCartButton.click();
    }

    public void clickToContinueShoppingButton() {
        log.info("Clicking on the continue to shopping button");
        wait.until(ExpectedConditions.visibilityOf(continueShoppingButton)).click();
        continueShoppingButton.click();
    }

    public void clickToCartButton() {
        log.info("Clicking on the cart button");
        Waiter.waitVisibilityOfElement(driver, cartButton);
        cartButton.click();
    }

    public String getPriceOfItem() {
        log.info("Getting price of item");
        return priceOfItem.getText();
    }
}
