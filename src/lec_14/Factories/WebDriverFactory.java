package lec_14.Factories;

import lec_14.Configuration;
import lec_14.Enums.Browsers;
import lec_14.IWebDriver;
import lec_14.WebDrivers.ChromeWebDriver;
import lec_14.WebDrivers.FirefoxWebDriver;
import lec_14.WebDrivers.SafariWebDriver;

public class WebDriverFactory {
    public IWebDriver create(){
        IWebDriver driver = null;

        Browsers browser = Browsers.valueOf(Configuration.getInstance().getBrowser().toUpperCase());

        switch(browser){
            case CHROME:
                driver = new ChromeWebDriver();
                break;
            case FIREFOX:
                driver = new FirefoxWebDriver();
                break;
            case SAFARI:
                driver = new SafariWebDriver();
                break;
            default:
                try {
                    throw new Exception("Browser doesn't supported");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        return driver;
    }
}