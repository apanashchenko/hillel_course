package trash.Interface.Login;

public class WelcomePage implements IWecomePage{

    private User user;

    public WelcomePage(User user) {
        this.user = user;
    }

    @Override
    public void showPage() {
        System.out.println("Show welcome page for " + user.getRole());
    }

    @Override
    public void showInfo() {
        System.out.println(this.user.toString());
    }
}
