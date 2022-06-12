package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.AddressPage;
import org.tms.service.AddressService;

import static org.tms.util.Constants.CITY_TITLE;

public class AddressPageTest extends BaseTest {
    AddressService addressService;

    @BeforeClass
    public void setUp() {
        addressService = new AddressService();
    }

    @Test
    public void createAddressErrorTest() {
        addressService.createYourAddressErrors();
        String actualMessageCreatingNewAddressErrors = addressService.getTheTextAddressError();
        String expectedMessageCreatingNewAddressErrors = "There are 3 errors";
        Assert.assertTrue(actualMessageCreatingNewAddressErrors.contains(expectedMessageCreatingNewAddressErrors), "Invalid address");
    }
    @Test
    public void createAddressTest(){
        addressService.createYourAddress();
        String actualMessageCreatingNewAddressErrors = addressService.getTheTitleBlockNameMyAddress();
        String expectedMessageCreatingNewAddressErrors = addressService.getTheNameAboutCreatingNewAddress();
        Assert.assertTrue(actualMessageCreatingNewAddressErrors.contains(expectedMessageCreatingNewAddressErrors), "Invalid address");

    }
    @Test
    public void deleteAddressTest(){

    }
}
