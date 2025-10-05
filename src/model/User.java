package model;

import java.util.ArrayList;

public class User {
    private static int counter = 1;

    private String name;
    private String userId;
    private ArrayList<Book> borrowedBooks;
    private int maxBooks;


    public User(String name, int maxBooks) {
        this.name = name;
        this.userId = "U" + counter++;
        this.borrowedBooks = new ArrayList<>();
        this.maxBooks = maxBooks;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", borrowedBooks=" + borrowedBooks.size() +
                ", maxBooks=" + maxBooks +
                '}';
    }
}
