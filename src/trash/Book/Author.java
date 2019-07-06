package trash.Book;

public class Author {
    private  String firstName;
    private  String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String ToString(){
        return "Author: {firstName=" + firstName + ", lastName=" + lastName+"}";
    }

    public boolean equals(Object o) {
        if (o instanceof Author) {
            return false;
        }
        Author author = (Author) o;
        return  this.firstName == author.firstName
                && this.firstName == author.firstName;

    }


}
