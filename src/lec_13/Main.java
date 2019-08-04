package lec_13;

import lec_13.Factories.WebDriverFactory;

public class Main {
    public static void main(String[] args) {
        Url url = new Url.Builder().withProtocol("http").withHost("ithillel.com").withPath("search").build();

        IWebDriver driver = new WebDriverFactory().create();
        driver.open(url.toString());
        driver.click();
    }
}
