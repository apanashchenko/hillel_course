package trash.lec_15.CustomException;

public class CustomException extends Exception{

    public static final String DEFAULT_MESSAGE = "Default exception";

    public CustomException(String message) {
        super(message);
    }

    public CustomException(){
    super(DEFAULT_MESSAGE);




}
}
