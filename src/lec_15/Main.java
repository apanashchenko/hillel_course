package lec_15;

import lec_15.Factories.WebDriverFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ILoadUsers allUsers = new LoadFromCsv();

        User userById = null;
        try {
            userById = allUsers.findById(4);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        try {
            List<User> usersByAge = allUsers.findByAge(5);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }


        Url url = new Url.Builder().withProtocol("http").withHost("ithillel.com").withPath("search").build();

        IWebDriver driver = new WebDriverFactory().create();
        driver.open(url.toString());
        driver.click();
        driver.sendKey(userById.getEmail());
    }
}