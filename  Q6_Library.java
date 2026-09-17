class Author {
    String name;
    String email;
    String gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    String title;
    double price;
    Author author;

    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String toString() {
        return "Book: " + title +
               "\nPrice: " + price +
               "\nAuthor: " + author;
    }
}

public class Q6_Library {
    public static void main(String[] args) {

        Author author = new Author(
            "Joshua Bloch",
            "jbloch@abc.com",
            "M"
        );

        Book book = new Book(
            "Effective Java",
            550,
            author
        );

        System.out.println(book);
    }
}