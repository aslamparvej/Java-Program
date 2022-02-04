/* 
Weight of hill pattern
Given,
the total levels in a hill pattern(input1)
the weight of the head level(input2) and
the weight increaments of each sub subsequents level(input3)
you are excepted to find the total weight of the hill.

Total levels represent the number of the rows in the pattern.
Head level represnt the first row.
weight of a level represent the value of each star(*) in that row

th hill patterns will always be of the below format, starting with 1 * the at head level and increasing 1 * at each level till level N
*
**
***
****
****
......n

example1:
Given,
the total levels in the hill pattern = 5(i.e. with 5 rows)
the weight of the head level (first row) = 10
the weight increaments of each subsequents levels = 2
then, the total weight of the hill pattern will be calculate as =
10+(12+12)+(14+14+14)+...+(18+18+18+18+18) = 10+24+42+...+90=230
*/

package Questions.InfyQTCodingQuestions;

import java.util.*;

public class Question_23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int totalWeight = 0;
        
        System.out.println("Enter the total number of hill level:");
        int nLevel = scn.nextInt();

        System.out.println("Enter the weight of head level:");
        int hWeight = scn.nextInt();

        System.out.println("Enter the weight increaments of each sub subsequents level");
        int enc = scn.nextInt();

        for(int i=1;i<=nLevel; i++){
            for(int j=1;j<=i; j++){
                totalWeight = totalWeight + hWeight;
            }
            hWeight = hWeight + enc;
        }
        System.out.println(totalWeight);
        scn.close();
    }
}
