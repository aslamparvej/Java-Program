/* Question: You are given an un sorrted array positive integer type elements.
Your task is to sort the given array in a "Wave Format".Such that elements at the even index are smaller and elements at the odd index are greater than their next elements.

First line of input contains lenght of array, and second line contains all elements of the given array, separated by space.

The single line of output should contain the resultant array elements separated by space.

Author: Aslam Parvej
*/ 
package Questions.InfyQTCodingQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class Questions_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
           arr[i] = scn.nextInt();

        int[] ans = sortWave(arr,n);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        scn.close();
    }

    public static int[] sortWave(int[] arr,int n){
        Arrays.sort(arr);
        int[] descArr = new int[n];
        for (int i=0;i<n;i++) {
            descArr[i] = arr[n-1-i];
        }
        for (int i=0; i<n-1; i += 2){
            swap(descArr, i, i+1);
        }
        return descArr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
