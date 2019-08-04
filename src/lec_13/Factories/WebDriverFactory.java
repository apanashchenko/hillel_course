package lec_13.Factories;

import lec_13.Configuration;
import lec_13.Enums.Browsers;
import lec_13.IWebDriver;
import lec_13.WebDrivers.ChromeWebDriver;
import lec_13.WebDrivers.FirefoxWebDriver;
import lec_13.WebDrivers.SafariWebDriver;

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
                System.out.println(browser + "doesn't supported");
        }

        return driver;
    }
}