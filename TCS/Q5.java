/*
 TCS NQT 24 OCT 2020 SLOT 1
 Coding Question 1:
 */

package TCS;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int noOfCandiesOrderByCustomer = scan.nextInt();
        // N = 10; K <= 5
        int N = 10;
        if (noOfCandiesOrderByCustomer > N) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("Number of Candies Sold:" + noOfCandiesOrderByCustomer);
            System.out.println("Number of Candies available:" + (N - noOfCandiesOrderByCustomer));
        }

        scan.close();
    }
}
