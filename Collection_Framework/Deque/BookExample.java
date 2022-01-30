package Collection_Framework.Deque;

import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }
}

public class BookExample {
    public static void main(String[] args) {
        Deque<Book> BookDeque = new ArrayDeque<Book>();

        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

        // Adding book in the deque
        BookDeque.add(b1);
        BookDeque.add(b2);
        BookDeque.add(b3);

        // Traversing ArrayDeque
        for (Book b : BookDeque) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
