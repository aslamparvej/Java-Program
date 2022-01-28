package Collection_Framework.LinkedList;

import java.util.*;

class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>(); // Declare LinkedList

        //Add element in linkedlist using add method
        ll.add("Banana");
        ll.add("Apple");
        ll.add("Orange");
        ll.add("Grapes");

        Iterator<String> itr = ll.iterator();  // Iterate the LinkedList by iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // add element by using index
        ll.add(3, "XSSS");
        System.out.println(ll);

        // remove() is used to delete an element from liknedlist
        ll.remove("Banana"); 
        System.out.println(ll);

        // size() method is used to return number of elements in the linkedlist.
        int s = ll.size();
        System.out.println(s);
    }
}