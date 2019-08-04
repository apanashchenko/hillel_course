package lec_15.WebDrivers;

import lec_15.Enums.Browsers;
import lec_15.IWebDriver;

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
