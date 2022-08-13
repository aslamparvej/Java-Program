/*
Question:
Given two non-negetive integers n1 and n2, where n1<n2. The task is to find the total number of integers in the range interval [n1,n2][both inclusive] which have no repeated digits

for e.g.
Suppose n1 = 11 and n2 = 15
There is the nuumber 11, which has repeated digits, but 12, 13,14 and 15 have no repeated digits. so, the output is 4.

*/
package TCS;
import java.util.*;


public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int ans =  getNumberOfDigits(n1,n2);
        System.out.println(ans);

        scan.close();
    }

    private static int getNumberOfDigits(int n1, int n2) {
        int numOfDigit = 0;
        for(int i=n1; i<=n2; i++){
            numOfDigit = numOfDigit + checkRepeated(i);
        }

        return numOfDigit;
    }

    private static int checkRepeated(int i) {
        HashSet<Integer> hs = new HashSet<>();
      
        while(i != 0){
            int digit = i%10;
            if(hs.contains(digit)){
                return 0;
            }
            hs.add(digit);
            i = i / 10;
       }

       return 1;
    }
}
