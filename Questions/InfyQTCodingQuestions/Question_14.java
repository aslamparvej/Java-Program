/*
Question: Program to find whether a number is perfect square or not
Input: Any integer positive
Output: Print Success if the input number is a perfect square and failure if the input number is not a perfect square
*/

package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_14{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter positive number to check it's perfect square or not:");
        int num = scn.nextInt();
        
        if(num%(int)Math.sqrt(num)==0){
             System.out.println("Success");
        }else{
             System.out.println("Failure");
        }

         scn.close();

    }
}
