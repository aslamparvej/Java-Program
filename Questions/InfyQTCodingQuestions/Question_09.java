// Question: Find second largest number of three number.
// Input: Three integer
// Output: Print second largest number.
//Author: Aslam Parvej
package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

class Questions_09{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three integer :");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        if(n1>n2 && n1>n3){
            if(n2>n3){
                System.out.println("The second largest number is :"+n2);
            }else{
                System.out.println("The second largest number is :"+n3);
            }
        }
        else if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println("The second largest number is :"+n1);
            }
            else{
                System.out.println("The second largest number is :"+n3);
            }
        }else{
            if(n1>n2){
                System.out.println("The second largest number is :"+n1);
            }else{
                System.out.println("The second largest number is :"+n2);
            }
        }
        scn.close();
    }
}