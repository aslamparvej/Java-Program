/* 
Question: Check ugly number

Input: An Integer array.
Output: print ugly if it's ugly, else print not ugly

ugly number: A number is considered to be ugly if it's only prime factors are 2,3 or 5
U = 2^a * 3^b * 5^c

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;

import java.util.*;

public interface Question_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res =  checkUgly(num);
        if(res == 1){
            System.out.printf("%d is an ugly number.",num);
        }else{
            System.out.printf("%d is not an ugly number.",num);
        }
        scn.close();
    }
    static int checkUgly(int num){
        // base case
        if(num == 1){
            return 1;
        }
        if(num<=0){
            return 0;
        }

        // if a number is divided by 2,3 or 5 is called ugly number
        if(num%2==0){
           return checkUgly(num/2);
        }
        if(num%3==0){
            return checkUgly(num/3);
        }
        if(num%5==0){
            return checkUgly(num/5);
        }

        return 0;
    } 
}
