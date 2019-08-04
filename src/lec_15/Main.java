package lec_15;

import lec_15.Factories.WebDriverFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ILoadUsers allUsers = new LoadFromCsv();

        User user1 = null;
        try {
            user1 = allUsers.findById(4);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        try {
            List<User> users = allUsers.findByAge(5);
            System.out.println(users);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }


        Url url = new Url.Builder().withProtocol("http").withHost("ithillel.com").withPath("search").build();


        IWebDriver driver = new WebDriverFactory().create();
        driver.open(url.toString());
        driver.click();
        driver.sendKey(user1.getEmail());
    }
}