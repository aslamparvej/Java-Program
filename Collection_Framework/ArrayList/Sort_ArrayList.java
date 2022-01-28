package Collection_Framework.ArrayList;
import java.util.*;

public class Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Banana");
        list1.add("Apple");
        list1.add("Grapes");
        list1.add("Orange");
        System.out.println(list1); // Before Sorting the arralist
        Collections.sort(list1);
        System.out.println(list1); // After Sorting the arralist

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(103);
        list2.add(23);
        list2.add(26);
        list2.add(45);
        list2.add(34);

        System.out.println(list2); // Before Sorting arraylist
        Collections.sort(list2);
        System.out.println(list2); // After Sorting arraylist

    }
}
