/* 
Q1. Input an array and then print the repeating characters??
Example:
Input:1,3,23,11,44,3,23,2,3.
Output:3,23 
*/
import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter array size:");
        int sizeOfArray = scn.nextInt();
        int[] arr = new int[sizeOfArray];

        System.out.println("Array Elements: ");
        for(int i=0; i<sizeOfArray; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> ans1 = checkReapetingChar1(arr, sizeOfArray);
        ArrayList<Integer> ans2 = checkReapetingChar2(arr, sizeOfArray);

        for (Integer item : ans1) {
            System.out.print(item+ " ");
        }
        for (Integer item : ans2) {
            System.out.print(item+ " ");
        }
        scn.close();
    }
    // Methon 1: Time complexcity: O(n^2);
    static ArrayList<Integer> checkReapetingChar1(int[] arr,int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i< n; i++){
            for(int j=i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    ans.add(arr[i]);
                }
            }
        }
        return ans;
    }
    // Methon 2: Time complexcity: O(n);
    // Methon 2: Time complexcity: O(n);
    static ArrayList<Integer> checkReapetingChar2(int[] arr,int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i< n; i++){
            if(!hs.isEmpty() && hs.contains(arr[i])){
                ans.add(arr[i]);
            }

            hs.add(arr[i]);
        }
        return ans;
    }
}