/*
Question: 
Write a program to print below pattern
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

Input Format: An Integer
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int num = scn.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                if(i>j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1;j<=i; j++){
                System.out.print(i);
                if(i>j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
