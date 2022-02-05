/* 
Question: Program to find LCM of two numbers.

Example: 
    Input: 15 20
    Output: 60
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_30 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in); 

       int num1 = scn.nextInt();
       int num2 = scn.nextInt();
       int res = lcm(num1,num2);
       System.out.println("The LCM of two numbers is: "+res);
       scn.close();
    }

    static int lcm(int a, int b) {

        return (a/gcd(a,b))*b;
    }

    static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
