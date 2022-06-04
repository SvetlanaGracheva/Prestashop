package org.tms.page;

public class MainPage extends Page{




    public MainPage openPage (String url){
        driver.get(url);
        return this;
    }
}
