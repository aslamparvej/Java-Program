/* 
Question: Program to find sum of digits.
Input: Any positive integer number
Output: Sum of all it's digit

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the positive integer to get sum of all it's digit:");
        int num = scn.nextInt();
        int sum = 0;
        while (num>0) {
            int mod = num%10;
            sum = sum + mod;
            num/=10;
        }
        System.out.println(sum);
        scn.close();
    }
}
