package Collection_Framework.PriorityQueue;
import java.util.*;

class Example{
    public static void main(String[] args) {
        // Creating java PriorityQueue
        PriorityQueue<String> pq = new PriorityQueue<String>();

        // Add elements in PriorityQueue
        pq.add("Aslam");
        pq.add("Arif");
        pq.add("Sakir");
        pq.add("Suvo");
        pq.add("Tommy");
        pq.add("Rick");
        pq.add("Sunny");

        // element() method is used to retrives 
        System.out.println("Head: " + pq.element());

        // peek() method is used to return head of this PriorityQueue, if queue is empty, then return null. 
        System.out.println("Head: " + pq.peek());

        // Iterating queue by using iterator() method
        System.out.println("Iterating queue Using iterator method:");
        Iterator<String> itr = pq.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // remove() method is used to retrives element and remove the head from of this queue 
        System.out.println("Remove element: "+ pq.remove());

        // poll() method is used to retrives element and remove the head from of this queue, if queue is empty return null
        System.out.println("Poll element: "+ pq.poll());

        System.out.println("Iterating queue after removing two elements:");
        Iterator<String> itr2 = pq.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}