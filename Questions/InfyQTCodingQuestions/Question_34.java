/*
Question: Program to convert decimal number to binary number
*/
package Questions.InfyQTCodingQuestions;

import java.util.*;

public class Question_34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimalNum = scn.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        convertBinary(decimalNum,temp);
        System.out.println(temp);
        scn.close();
    }

    private static void convertBinary(int decimalNum, ArrayList<Integer> temp) {
        // 123%2 = 1
        // call recursusion.
        // add rem to arr.

        // Base case
        if(decimalNum == 1){
            temp.add(1);
            return;
        }
        int rem = decimalNum%2;
        convertBinary(decimalNum/2,temp);
        temp.add(rem);
    }

}
