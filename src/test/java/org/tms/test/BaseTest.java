package org.tms.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.tms.driver.DriverSingleton;
import org.tms.driver.WebDriverFactory;
import org.tms.util.TestListener;

@Listeners(TestListener.class)

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
