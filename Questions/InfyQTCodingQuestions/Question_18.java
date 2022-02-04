
/*
Question: Program to check existence of pair with given sum in array
Example:
sum = 10
No. of elements are 0 2 5 7 4 6 10 20 -10
Result: Array has two two elements with given sum

Input Format:
First line of input is sum
Second line of input is No. of element in N,
Third line of input is, N elements separated by a single space

Output Format:
Print "Array has two elements with given sum" if required pair exists, and print "Array doesn't have two elemets with given sun" if required pair do not exist.

Author : Aslam Parvej
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;
public class Question_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int sum = scn.nextInt();
        int N = scn.nextInt();

        for(int i=0; i<N; i++){
            arr.add(i,scn.nextInt());
        }

        // boolean res = check(sum,arr);
        boolean res = check2(sum,arr);
        if(res){
            System.out.println("Array has two elements with given sum");
        }else{
            System.out.println("Array doesn't have two elemets with given sun");
        }
        scn.close();
    }
    // naive Approach
    static boolean check(int sum, ArrayList<Integer> arr){
        boolean flag = false;
        for(int i=0;i< arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(i) + arr.get(j) == sum){
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }
    // Optimal Approach
    static boolean check2(int sum, ArrayList<Integer> arr){
        boolean flag = false;
        Collections.sort(arr);
        int l = 0;  // left index
        int r  = arr.size() -1; // Right index

        while (l<r) {
            if(arr.get(l)+arr.get(r) == sum){
                flag = true;
                return flag;
            }else if(arr.get(l)+arr.get(r) < sum){
                l++;
            }else{
                r--;
            }
        }
        return flag;
    }
}
