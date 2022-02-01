/* 
Question: Print digit of a given number in same order
Input: Any positive integer number
Output: Print digits og the input number in same order in space separated

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_16 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       System.out.println("Enter a positive integer:");
       int num = scn.nextInt();
       int newNum = 0;
       while (num>0) {
            newNum = newNum*10+num%10;
            num/=10;
       }
       while (newNum>0) {
           System.out.print(newNum%10+ " ");
           newNum/=10;
       } 
       scn.close();
    }
}
