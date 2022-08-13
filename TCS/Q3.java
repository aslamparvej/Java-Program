package TCS;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArr = scan.nextInt();
        int[] arr = new int[sizeOfArr];
        for(int i=0; i<sizeOfArr; i++){
            arr[i] = scan.nextInt();
        }

        int[] arr10 = new int[sizeOfArr];
        int count = 0;
        for(int i=0; i<sizeOfArr; i++){
            if(arr[i] % 10 != 0){
                arr10[count] = arr[i];
                count++;
            }
        }
        for(int i = 0; i<sizeOfArr; i++){
            if(arr[i] % 10 == 0){
                arr10[count + i -1] = arr[i];
            }
        }

        for(int i: arr10){
            System.out.print(i +" ");
        }
        scan.close();
    }
}
