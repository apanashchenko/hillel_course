package lec_16.WebDrivers;

import lec_16.Enums.Browsers;
import lec_16.Logger.FileLogger;
import lec_16.WebDriver;

public class ChromeWebDriver extends WebDriver {
    @Override
    public void open(String url) {
        FileLogger.addToLogList("Open " + Browsers.CHROME + " url: " + url);
    }
}
