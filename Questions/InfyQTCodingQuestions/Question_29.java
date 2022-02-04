/* 
Segregate 0s and 1s:
Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.

Example_01:
Input:
N = 5
arr[] = {0, 0, 1, 1, 0}
Output: 0 0 0 1 1

Input:
N = 4
Arr[] = {1, 1, 1, 1}
Output: 1 1 1 1

Explanation: There are no 0 in the given array, 
so the modified array is 1 1 1 1.
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

public class Question_29{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        segregate0and1(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        scn.close();
    }
    static void segregate0and1(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        
        while(left<right){
            while(arr[left]==0 && left<right){
               left++;
            }
            while(arr[right]==1 && left<right){
                right--;  
            } 
            if(left<right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}