// Question: Find out greatest of three
// Input: Tree integer
// Output: Print the grestest number.
//Author: Aslam Parvej

package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

class Question_07{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three Integer to get greatest number: ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("The Greatest Number is: " + n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("The Greatest Number is: " + n2);
        }
        else{
            System.out.println("The Greatest Number is: " + n3);
        }
        scn.close();
    }
}