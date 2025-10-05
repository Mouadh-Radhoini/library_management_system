import model.Book;
import model.User;
import service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book b1 = new Book("The Power", "Mouadh", "123456789");
        Book b2 = new Book("Java Basics", "John", "987654321");
        library.addBook(b1);
        library.addBook(b2);

        // Add users
        User u1 = new User("Ali", 3);
        User u2 = new User("Sami", 2);
        library.registerUser(u1);
        library.registerUser(u2);

        // Print all books and users
        System.out.println("Books in library:");
        library.listBooks();

        System.out.println("\nRegistered users:");
        library.listUsers();
    }
}
