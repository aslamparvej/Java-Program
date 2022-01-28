package Collection_Framework.ArrayList;
import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterating arraylist using Iterator
        java.util.Iterator<Integer> itr=list.iterator(); // getting iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
