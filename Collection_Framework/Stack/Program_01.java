package Collection_Framework.Stack;
import java.util.*;

public class Program_01 {
    public static void main(String[] args) {
        // Create Stack Object
        Stack<Integer> st = new Stack<Integer>(); 

        // empty() method is used to return true, if the stack is empty else false
        System.out.println(st.empty());

        // push() method is used to insert specified elememt top on the stack 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(60);
        
        System.out.println(st);
        System.out.println(st.empty());

        // pop() method used to removes an object at the top of the stack and return the same object
        System.out.println(st.pop());

        // peek():- It looks at the element that is at the top in the stack
        System.out.println(st.peek());

        // size() is used to return number of element in the stack
        System.out.println(st.size());

        // iterator() method is used to iterate the stack
        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
