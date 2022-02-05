/* 
Question: Program to convert binary to decimal.

*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int binaryNum = scn.nextInt();
        int count = 0;

        int temp = binaryNum;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        long res = convertBiToDe(binaryNum,count);
        System.out.println("The Decimal number is: "+res);
        scn.close();
    }

    private static long convertBiToDe(int binaryNum, int num) {
        long res = 0;
        for(int i=0; i<num; i++){
            int temp = binaryNum%10;
            binaryNum/=10;
            res = (long) (res+temp*Math.pow(2, i));
        }
        return  res;
    }
}
