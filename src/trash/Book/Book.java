package trash.Book;

public class Book {
    private int id;
    private String title;
    private Author author;
    private int year;

    public Book(int id, String title, Author author, int year) {
        this.author = author;
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean equals(Object o) {
        if (o instanceof Book) {
            return false;
        }
        Book book = (Book) o;
        return  this.year == book.year
                && this.title.equals(book.title)
                && this.id == book.id
                && this.author.equals(book.author);
    }
}


