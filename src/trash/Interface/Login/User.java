package trash.Interface.Login;

public class User implements ILoginForm {
    private String email;
    private String password;
    private  String role;


    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public WelcomePage login() {
        System.out.println("User with email " + this.email + " and password want to login") ;
        return new WelcomePage(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
