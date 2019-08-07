package lec_16;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super("User with " + message + " not found");
    }
}
