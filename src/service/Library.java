package service;

import model.Book;
import model.User;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;


    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void registerUser(User user) {
        users.add(user);
    }


    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // List all users
    public void listUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
    public void borrowBook(String ISBN ,String userId) {

        if(ISBN == null || userId ==null ){
            System.out.println(" the user id and th isbn must be not null ");
            return;
        }
        Book foundBook = null;
        for (Book b : books) {
            if(b.getISBN().equals(ISBN)){
                foundBook = b;
                break;
            }
        }
        if (foundBook == null) {
            System.out.println("Book not found with ISBN: " + ISBN);
            return;
        }
        User foundUser = null;
        for (User u : users) {
            if (u.getUserId().equals(userId)) {
                foundUser = u;
                break;
            }
        }
        if (foundUser == null) {
            System.out.println(" User not found with ID: " + userId);
            return;
        }
        if (!foundBook.isAvailable()) {
            System.out.println(" The book \"" + foundBook.getTitle() + "\" is already borrowed.");
            return;
        }
        if (foundUser.getBorrowedBooks().size() >= foundUser.getMaxBooks()) {
            System.out.println( foundUser.getName() + " has reached the borrow limit (" + foundUser.getMaxBooks() + ").");
            return;
        }
        foundUser.getBorrowedBooks().add(foundBook);
        foundBook.setAvailable(false);

        System.out.println(foundUser.getName() + " borrowed \"" + foundBook.getTitle() + "\" (ISBN: " + foundBook.getISBN() + ").");




    }
}
