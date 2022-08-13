/*
Q3. Find the longest palendrom in a string?
Example
Input: abfgerccdedccfgfer
Output: ccdedcc 
*/

// it's DP Question
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = "";
        st = scn.next();

        int start = 0;
        int end = st.length() -1;
        boolean flag = false;

        while(st.length() !=0 && start <= end){
            if(st.charAt(start) == st.charAt(end)){
                flag = true;
                start++;
                end--;
            } 
        }
        String ans = "";
        if(flag){
            ans = st.substring(start,end +1);
        }
        
        System.out.println(ans);
        scn.close();
    }
}
