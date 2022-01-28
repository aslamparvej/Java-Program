/* Question: You are provided with a positive number 'x'.For this number find the of x after performing the following operation:
    1: Update x by adding reverse of x to it.
    2: If the value of x is palindrome then stop, otherwise repeat step 1.
*/
// Author: Aslam Parvej

package Questions.InfyQTCodingQuestions;
import java.util.*;
public class Question_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        while(true){
            int rx = reverseNumber(x);
            x = x + rx;
            if(isPalindrome(x)){
                break;
            }
        }
        System.out.println(x);
        scn.close();
    }

    public static int reverseNumber(int x){
        int rx = 0;
        while(x != 0){
            rx = rx*10 +x%10;  // 123%10=3 ->rx=0*10+3=3, 12%10=2 -> rx=3*10+2=32, 1%10=1 -> rx=32*10+1=321
            x = x/10;   // 12,1
        }
        return rx;
    }
    public static boolean isPalindrome(int x){
        int rx = reverseNumber(x);
        if(x == rx){
            return true;
        }
        return false;
    }
}
