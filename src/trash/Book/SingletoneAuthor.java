package trash.Book;

public class SingletoneAuthor {
    public static SingletoneAuthor instance;
    private SingletoneAuthor(){
    }

    public static SingletoneAuthor getInstance() {
        if (instance == null) {
            instance = new SingletoneAuthor();
        }
        return instance;
    }
}
