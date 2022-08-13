/* 
Q2. Input an array and prints the second minimum in an array??
Example
Input:34,45,21,12,54,67,15
Output:15
*/
import java.util.*;

public class Q2 {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter arr size:");
        int sizeOfArray = scn.nextInt();

        int[] arr = new int[sizeOfArray];
        System.out.println("Enter array elements:");
        for(int i=0; i<sizeOfArray; i++){
            arr[i] = scn.nextInt();
        }

        int ans1 = secondMinimumElement1(arr, sizeOfArray);
        int ans2 = secondMinimumElement2(arr, sizeOfArray);
        int ans3 = secondMinimumElement3(arr, sizeOfArray);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        scn.close();
    }
    // method 1:
    // time complexity: O(nlogn)
    // space complexcity: O(1)
    private static int secondMinimumElement1(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[1];
    }
    // method 2:
    // time complexity: O(n)
    // space complexcity: O(1)
    private static int secondMinimumElement2(int[] arr, int n) {
        int MinElement = Integer.MAX_VALUE;
        int SecondMinElement = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(MinElement > arr[i]){
                MinElement = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] != MinElement){
                if(arr[i] < SecondMinElement){
                    SecondMinElement = arr[i];
                }
            }
        }
        return SecondMinElement;
    }
    // method 1:
    // time complexity: O(n)
    // space complexcity: O(1)
    private static int secondMinimumElement3(int[] arr, int n) {
        int firstMinElement  = Integer.MAX_VALUE;
        int  secondMinElement = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < firstMinElement){
                secondMinElement = firstMinElement;
                firstMinElement = arr[i];
            }else if(arr[i] < secondMinElement && arr[i] != firstMinElement){
                secondMinElement = arr[i];
            }
        }
        return secondMinElement;
    }
}
