package lec_13.WebDrivers;

import lec_13.Enums.Browsers;
import lec_13.IWebDriver;

public class ChromeWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open " + Browsers.CHROME + " url: " + url);
    }

    @Override
    public void click() {
        System.out.println("Click");
    }
}
