package trash.Book;

public class SingletoneMain {
    public static void main(String[] args) {
        Author author = new Author("Kon'","Pedalniy");
        Book kolobok1 = new Book(1, "Kolobok", author, 1987);
        System.out.println(kolobok1);


        author.setFirstName("Alex");
        author.setLastName("Pushkin");

        Book kolobok2 = new Book(2, "Kolobok", author, 1987);
        System.out.println(kolobok2);
    }
}
