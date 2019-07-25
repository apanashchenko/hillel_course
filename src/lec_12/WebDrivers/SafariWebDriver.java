package lec_12.WebDrivers;

import lec_12.IWebDriver;

public class SafariWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Safari url" + url);
    }
}
