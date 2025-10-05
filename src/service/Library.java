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
}
