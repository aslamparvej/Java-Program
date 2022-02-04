/* 
Question: 
For given positive number num, identify the palindrome formed by perfoming following operations.
    1: Add num abd it's reverse
    2: Check whether the sum is palindrome or not. If not, add the sum and it's reverse and repeat the process until a palindrome is obtained.

Example:
    Sample input: 124
    Sample output: 545

    Sample input: 4
    Smaple output: 8
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scn.nextInt();

        int revNum = reverseNum(num);
        num = num+revNum;
        
        while (!isPalindrome(num)) {
            int temp = reverseNum(num);
            num = num + temp;
        }
        System.out.println(num);
        scn.close();
    }

    static boolean isPalindrome(int num) {
        if(num == reverseNum(num)){
            return true;
        }
        return false;
    }

    static int reverseNum(int num) {
        int rev = 0;
        while (num>0) {
            rev = rev*10+num%10;
            num = num/10;
        }
        return rev;
    }
}
