package trash.Book;

public class Main {
    public static void main(String[] args) {
        Author author= new Author("Steven", "King");
       // System.out.println(author.getFirstName());
       // System.out.println(author.ToString());

        Book kolobok1 = new Book(123, "Kolobok", author, 1987);
        Book kolobok2 = new Book(123, "Kolobok", author, 1987);


        System.out.println(kolobok1.equals(kolobok2));
    }
}
