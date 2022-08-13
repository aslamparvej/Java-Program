/*
 TCS NQT 24 OCT 2020 SLOT 1
 Coding Question 1:
 */
package TCS;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        while(count <= 9){
            int x = scan.nextInt();
            if(x <1 && x>100){
                System.out.println("INVALID INPUT");
                count++;
            }
            else{
                if(count % 3 == 1){
                    t1 += x;
                    count++;
                }
                else if(count % 3 == 2){
                    t2 += x;
                    count++;
                }
                else{
                    t3 += x;
                    count++;
                }
            }
        }
       
        int A1 = t1/3;
        int A2 = t2/3;
        int A3 = t3/3;

        if(A1 < 70 && A2 < 70 && A3 < 70){
            System.out.println("All trainee are unfit");
        }else{
            if(A1>= A2 && A1>= A3){
                System.out.println("Trainee Number: 1");
            }
            if(A2>= A1 && A2>= A3){
                System.out.println("Trainee Number: 2");
            }
            if(A3>= A1 && A3>= A2){
                System.out.println("Trainee Number: 3");
            }
        } 
        
        scan.close();
    }
}