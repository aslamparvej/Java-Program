/* 
Question: Given a non-empty string containing only digits. Write a program to return an array based on logic:
    1: Indentity all possible substrings of digits which are pronic numbers
    2: Score the identified pronic number by arranging them in ascending order and removing the duplicates if any.
    3: If no pronic numbers can be identified then return -1
    4: 0 (zero) is not a pronic number.

Example: 
    Sample input: 93012562
    Sample output: 2,6,12,30,56,930
Pronic number: 
    -- Pronic numbers are the product of two consecutive numbers.
    -- Pronic numbers are of the form n*(n-1).
    -- All Pronic numbers are event number.

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_27 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>(); 

        System.out.println("Enter value:");
        String str = scn.nextLine();

        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){

                String substr = str.substring(i, j+1);
                int temp = Integer.parseInt(substr);
                set.add(temp);
                System.out.print(substr+" ");
            }
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            for(int i=1; i<Math.sqrt(num)+1; i++){
                if(i*(i+1) == num){
                    arr.add(num);
                }
            }
        }
        Collections.sort(arr);
        if(arr.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println();
            System.out.print(arr);
        }
        
        scn.close();
    }
}
