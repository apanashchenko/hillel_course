package lec_14.WebDrivers;

import lec_14.Enums.Browsers;
import lec_14.IWebDriver;

public class FirefoxWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open " + Browsers.FIREFOX + " url: " + url);
    }

    @Override
    public void click() {
        System.out.println("Click");
    }
}
