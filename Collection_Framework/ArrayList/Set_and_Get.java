package Collection_Framework.ArrayList;

import java.util.*;

public class Set_and_Get {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding object in arraylist
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        // Accessing element 
        System.out.println(list.get(2));

        System.out.println(list); // Before update list
        
        list.set(1, "Grapes"); // Update data
        
        System.out.println(list); // Print arraylist
    }
}
