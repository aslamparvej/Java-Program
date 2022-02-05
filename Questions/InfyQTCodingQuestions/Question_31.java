/* 
Question: Write a program to find N-th fibonacci number.


*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_31 {
    // using iteration
    private static long fiboItr(int n){
        int a = 0, b = 1, c;
        if(n == 0){
            return a;
        }
        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N-th value: ");
        int N = scn.nextInt();

        long res = fibo(N);
        long res1 = fiboItr(N);
        System.out.println(res);
        System.out.println(res1);

        scn.close();
    }
    // using recursion.
    private static long fibo(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
