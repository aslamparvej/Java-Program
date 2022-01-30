package Collection_Framework.Deque;

import java.util.*;

public class Example{
    public static void main(String[] args) {
        // Creating Deque object
        Deque<String> dq = new ArrayDeque<String>();

        // add element in deque
        dq.add("Aslam");
        dq.add("Tony");
        dq.add("Bibek");
        dq.add("Zain");

        // iterating deque 
        Iterator<String> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // offer() method is used to inserting element in last of the deque 
        // poll() method is used to remove first element from deque 
        dq.offer("Souvik");
        dq.poll();
        System.out.println("After offer Souvik and poll");
        Iterator<String> itr1 = dq.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        // offerFirst() method is used to insert element in the first of the deque
        // pollLast() method is used to remove element from last of the deque

        dq.offerFirst("Ashu");
        dq.pollLast();

        System.out.println("After offerFirst() and pollLast()");
        Iterator<String> itr2 = dq.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}