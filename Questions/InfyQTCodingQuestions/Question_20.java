/*
Question: Check a number is angstrom number or not.

Input: A positive integer
Output: If number is angstrom number print 'True' otherwise 'False'.

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_20 {

    static boolean angstromNum(int num){
        boolean flag = false;
        int count = 0, temp = 0, sum=0;
        temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = num;
        while(temp>0){
            sum = (int) (sum + Math.pow((temp%10), count));
            temp = temp /10;
        }
        if(sum == num) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int num = scn.nextInt();
        boolean res = angstromNum(num);
        if (res) {
            System.out.println("Input number is angstrom number:");
        }else{
            System.out.println("Input number is not angstrom number:");
        }
        scn.close();
    }
}
