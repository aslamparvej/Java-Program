// Question: Writte a progarm to sum of all the possible prime number within a range
// Input: Two positive integer
// Output: Sum of the all possible prime number
package Basic.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two possible integer: ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int i,j,flag,sum=0;
        System.out.println("Possible prime number");
        for(i=n1; i<=n2; i++){
            if(i == 0|| i == 1){
                continue;
            }
            flag = 1;
            for(j=2;j<=i/2; ++j){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of the all possible prime number is: "+ sum);
    }
}
