package trash.lec_13.Infrastructure.WebDrivers;

import trash.lec_13.Infrastructure.WebDriver;

public class ChromeWebDriver implements WebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Chrome url" + url);
    }

    @Override
    public void click() {
        System.out.println("Chrome click on element");
    }

    @Override
    public void sendKey(String sendKey) {
        System.out.println("Chrome sendkey" + sendKey);
    }
}
