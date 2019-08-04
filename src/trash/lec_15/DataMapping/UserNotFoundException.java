package trash.lec_15.DataMapping;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super("User with " + message + "not found");
    }
}
