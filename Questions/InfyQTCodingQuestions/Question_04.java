//Question: Write a program to find out a number prime or not if number is prime print the number.

// Input: A positive integer
// Output: If number is prime print "number is prime with number" number, if number is not prime print "number is not prime" with number

// Author: Aslam Parvej

// if flag = 1 input number is prime or flag = 0 input number is not prime

package Questions.InfyQTCodingQuestions;
import java.util.Scanner;

public class Question_04 {

    //Optimization way to check prime number
    static int primeNumber(int num){

        int flag = 1;
        if( num == 0 || num == 1){
            flag = 0;
            return flag;
        }
        for(int i=2;i<Math.sqrt(num); i++){
            
            if(num % i == 0){
                flag = 0;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check is prime or not: ");
        int number = scn.nextInt();
        // int m = 0;
        // int flag = 1;
        // m = number / 2;
        // if (number == 0 || number == 1) {
        //     System.out.println(number + " is not prime number");
        // } else {
        //     for (int i = 2; i <= m; i++) {
        //         if (number % i == 0) {
        //             System.out.println(number + " is not prime number");
        //             flag = 0;
        //             break;
        //         }
        //     }
        // }
        int flag = primeNumber(number);
        if (flag == 1) {
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is not prime number");
        }

        scn.close();
    }

}
