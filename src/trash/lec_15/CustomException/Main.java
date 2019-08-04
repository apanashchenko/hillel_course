package trash.lec_15.CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("New custom exception");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
