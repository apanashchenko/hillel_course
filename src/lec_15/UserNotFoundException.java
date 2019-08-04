package lec_15;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super("User with " + message + " not found");
    }
}
