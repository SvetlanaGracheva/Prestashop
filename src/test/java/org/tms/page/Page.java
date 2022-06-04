package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.tms.driver.DriverSingleton;

public abstract class Page {
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final static int WAIT_TIMEOUT_SECONDS = 10;

    protected Page() {
        PageFactory.initElements(driver, this);
    }
}
