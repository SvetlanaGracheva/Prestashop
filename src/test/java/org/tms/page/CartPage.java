package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page{
    @FindBy (xpath = "//td[@class='cart_description']//*[contains(text(), 'Printed Dress')]")
    private WebElement ItemInTheCart; //  товар в корзине

    @FindBy(xpath = "//a[@id='3_13_0_0']")
    private WebElement removeItemButton; //кнопка удалить









    public String descriptionItemInTheCart(){
        return ItemInTheCart.getText(); // получить название товара в корзине
    }

    public void clickRemoveButton(){
        removeItemButton.click(); //нажать удалить
    }

}
