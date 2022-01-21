// Question: Write a program to calculate factorial of a number 
// Input: Any positive Integer 
// Output: factorial of input number
// Author: Aslam Parvej
package Basic.InfyQTCodingQuestions;

import java.util.Scanner;

class Factorial{
    //Factorial using Reccursion
    static long factUsingRec(int n){
        if(n == 0) 
        {
            return 1;
        }
        return n*factUsingRec(n-1);
    }
    // Factorial using Iteration
    static long factusingItr(int n){
        long fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Number to calculate factorial: ");
        int n = scn.nextInt();

        // Calculate factorial using reccursion
        long factorial1 = factUsingRec(n);
        long factorial2 = factusingItr(n);
        System.out.println(factorial1);
        System.out.println(factorial2);

        scn.close();
    }
}