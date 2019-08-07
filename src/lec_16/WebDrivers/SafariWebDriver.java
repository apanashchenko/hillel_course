package lec_16.WebDrivers;

import lec_16.Enums.Browsers;
import lec_16.IWebDriver;

public class SafariWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open " + Browsers.SAFARI + " url: " + url);
    }

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void sendKey(String key) {
        System.out.println("Send " + key);
    }
}