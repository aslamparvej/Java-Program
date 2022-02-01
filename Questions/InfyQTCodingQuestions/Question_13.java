/* 
Question: Users enter date in dd-mm-yyyy find out number of days in month(for now please     ignore the concept of leap year) 

Input: Date in dd-mm-yyyy format
Output: Number of days in the date in the entered by user

Author: Aslam Parvej
*/

package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_13{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Enter date in dd-mm-yyyy format: ");
        String date = scn.nextLine();

        String month = date.substring(3,5);

        int month1 = Integer.parseInt(month);
        if(month1>=10){
            System.out.println(arr[month1 - 1]);
        }else{
            int ans = month1%10;
            System.out.println(arr[ans -1]);
        }

        scn.close();
    }
}