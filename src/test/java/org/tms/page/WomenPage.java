package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Page{
    @FindBy(xpath = "//a[@data-id-product='3']//span[contains(text(), 'Add to cart')]")
    private WebElement addToCartButton;// добавить товар в корзину

    @FindBy(xpath ="//a[@class='btn btn-default button button-medium']//span[contains(text(), 'Оформить заказ')]")
    private WebElement placeAnOrderButton; // кнопка оформить заказ

    public void clickToCardButton(){
        addToCartButton.click();// клик на товар
    }
    public void clickPlaceAnOrderButton(){
        placeAnOrderButton.click(); // клик оформить товар
    }
}
