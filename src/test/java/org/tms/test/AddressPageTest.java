package org.tms.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.AddressPage;
import org.tms.service.AddressService;

public class AddressPageTest extends BaseTest{
    AddressService addressService;

    @BeforeClass
    public void setUp(){addressService=new AddressService();}

@Test
public void createAddressTest(){
        addressService.createYourAddress();
        String actualMessageCreatingNewAddress=addressService.getTheNameAboutCreatingNewAddress();
    String expectedTextBlockNameMyAddress=addressService.getTheTitleBlockNameMyAddress();
}
}
