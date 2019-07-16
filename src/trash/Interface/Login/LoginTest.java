package trash.Interface.Login;

public class LoginTest {
    public static void main(String[] args) {
        User user = new User("user@mail.com", "qwerty", "user");
        WelcomePage welcomePageUser = user.login();
        welcomePageUser.showPage();
        welcomePageUser.showInfo();

        System.out.println("======================");

        User admin = new User("admin@mail.com", "qwerty", "admin");
        WelcomePage welcomePageAdmin = admin.login();
        welcomePageAdmin.showPage();
        welcomePageAdmin.showInfo();
    }
}