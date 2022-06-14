package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.AddressPageService;

public class AddressPageFalseTest extends BaseTest{
    private AddressPageService addressPageService;

    @BeforeClass
    public void setUp() {
        addressPageService = new AddressPageService();
    }
    @Test
    public void createAddressFalseTest() {
        addressPageService.createYourAddressFalse();
        String actualTitleOfAddressFalse = addressPageService.getTitleOfAddressFalsePage();
        String expectedTitleOfAddressFalse = "There are 3 errors";
        Assert.assertEquals(actualTitleOfAddressFalse,expectedTitleOfAddressFalse,"The actual title of the address does not match expected!");
    }
}
