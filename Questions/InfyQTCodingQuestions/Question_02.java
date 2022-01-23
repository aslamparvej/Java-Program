// Question: Write a program to calculate area of a circle 
// Input: Any positive Integer denoting diameter
// Output: Area of a cycle with two precision points
// Author: Aslam Parvej


package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("");
        int n = scn.nextInt();
        float area = (float) (n * 3.14);
        System.out.print(String.format("%.2f", area));

        scn.close();
    }
}
