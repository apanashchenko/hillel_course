package trash.lec_13.Infrastructure.WebDrivers;

import trash.lec_13.Infrastructure.WebDriver;

public class EdgeWebDriver implements WebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Edge url" + url);
    }

    @Override
    public void click() {
        System.out.println("Edge click on element");
    }

    @Override
    public void sendKey(String sendKey) {
        System.out.println("Edge sendkey" + sendKey);
    }
}
