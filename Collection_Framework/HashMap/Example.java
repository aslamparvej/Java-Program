package Collection_Framework.HashMap;

import java.util.*;

public class Example{
    public static void main(String[] args) {
        // Creating HashMap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        // add element in the HashMap
        hm.put(1, "Mango");
        hm.put(2, "Apple");         // put() method is used to add element in the map
        hm.put(3, "Banana");
        hm.put(4, "Grapes");

        System.out.println("Iterating HashMap:");

        // getKey() method is used to return key of the object
        // getValue() method is used to return value of the object
        for (Map.Entry<Integer,String> m: hm.entrySet()) {
            System.out.println(m.getKey() +" "+m.getValue());
        }

        /*You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.*/
        hm.put(1, "Orange");
        System.out.println("After insert duplicate value in the HashMap........");

        for (Map.Entry<Integer,String> m: hm.entrySet()) {
            System.out.println(m.getKey() +" "+m.getValue());
        }

        // remove() method used to remove object from the HasHMap
        System.out.println("initial Hashmap: "+ hm);
        hm.remove(1);
        System.out.println("After delete elememt by using Key: "+ hm);
        hm.remove(3, "Banana");
        System.out.println("After delete elememt by using Key-Value pair: "+ hm);

        // replace() method is used tp replace the specified value for a specified key.
        hm.replace(2, "Banana");
        hm.replace(4, "Grapes", "Orange");
        System.out.println("After replace 2 and 4 key's value: " + hm);

    }
}