/*
Sum of the all number without lie between 4 and 7
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_36 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       String str = scn.next();

       int res = getSum(str);
       System.out.println(res);

       scn.close();
       
    }

    private static int getSum(String str) {
        char[] ch = str.toCharArray();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '7' || str.charAt(i) == '6' ||str.charAt(i) == '5' || str.charAt(i) == '4'){
                continue;
            }else{
                sum+= Character.getNumericValue(ch[i]);
            }
        }
        return sum;
    }
}
