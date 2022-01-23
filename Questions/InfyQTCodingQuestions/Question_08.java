// Question: Find out smallest of four numbers.
// Input: Four integer.
// Output: Print smallest number.
//Author: Aslam Parvej
package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter four number to get smallest number: ");

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int n4 = scn.nextInt();

        if(n1<n2 && n1<n3 && n1<n4){
            System.out.println("The smallest number is: " + n1);
        }
        else if(n2<n1 && n2<n3 && n2<n4){
            System.out.println("The smallest number is: " + n2);
        }
        else if(n3<n1 && n3<n2 && n3<n4){
            System.out.println("The smallest number is: " + n3);
        }
        else{
            System.out.println("The smallest number is: " + n4);
        }
        scn.close();
    }
}
