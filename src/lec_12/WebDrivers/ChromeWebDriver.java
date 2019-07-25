package lec_12.WebDrivers;


import lec_12.IWebDriver;

public class ChromeWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Chrome url" + url);
    }
}
