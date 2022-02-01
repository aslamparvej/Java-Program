/* 
Question: Program to print box number pattern of 1 and 0

Input: Given a single line input separated by space. N1 denotes the number of rows N2 denotes the number of columns.

Output: Print the output in the requered format.

Author: Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;
public class Question_17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int N1 = scn.nextInt();
        System.out.println("Enter the number of column:");
        int N2 = scn.nextInt();

        for(int i=1;i<=N1;i++){
            if(i==1 || i==N1){
                for(int j=1;j<=N2;j++){
                    System.out.print(1+" ");
                }
            }else{
                for(int j=1;j<=N2;j++){
                    if(j==1 || j==N2){
                        System.out.print(1+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }
            }
            System.out.println();      
        }
        scn.close();
    }
}
