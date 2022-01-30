/*Let's see a PriorityQueue example where we are adding books to queue and printing all the books. The elements in PriorityQueue must be of Comparable type. String and Wrapper classes are Comparable by default. To add user-defined objects in PriorityQueue, you need to implement Comparable interface. */

package Collection_Framework.PriorityQueue;

import java.util.*;
class Book implements Comparable<Book>{
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id,String name,String author, String publisher,int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book b){
        if(id>b.id){
            return 1;
        }
        else if(id<b.id){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class BookExample {
    public static void main(String[] args) {
        Queue<Book> BookQueue = new PriorityQueue<Book>();

        // Creating Book
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        // Adding book in queue
        BookQueue.add(b1);
        BookQueue.add(b2);
        BookQueue.add(b3);

        // Traversing book 
        for (Book i: BookQueue) {
            System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }

        BookQueue.remove();
        System.out.println("After remove one element");
        for (Book j: BookQueue) {
            System.out.println(j.id+" "+j.name+" "+j.author+" "+j.publisher+" "+j.quantity);
        }
    }
}
