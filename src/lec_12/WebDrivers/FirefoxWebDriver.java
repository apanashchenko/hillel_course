package lec_12.WebDrivers;


import lec_12.IWebDriver;

public class FirefoxWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Firefox url" + url);
    }
}
