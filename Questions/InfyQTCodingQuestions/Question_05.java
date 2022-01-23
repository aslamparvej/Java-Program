// Question: Write a program to find out prime number within a range
// Input: Two positive Integer 
// Output: Lists of the possible numbers within range separte by space 
package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two positive integer: ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int i, j, flag;

        for (i = n1; i < n2; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
