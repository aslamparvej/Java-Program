/*
Question: First and last occurence of anumber in the array.
*/
package Questions.InfyQTCodingQuestions;
import java.util.*;

class Question_21{
    public static ArrayList<Integer> firstAndLast(ArrayList<Integer> arr, int n, int x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        int first = -1, last = -1;
        
        for(int i=0; i<n; i++){
            if(x == arr.get(i)){
                first = i;
                last = i;
                break;
            }
        }
        for(int i=first+1;i<n;i++){
            if(arr.get(i) == x){
                last = i;
            }
        }
        
        if(first == -1 || last == -1){
            res.add(-1);
            return res;
        }else{
           res.add(first);
           res.add(last);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i <n; i++) {
            arr.add(i,scn.nextInt());
        }
        Collections.sort(arr);
        System.out.println("Enter the element to find first and last occurence:");
        int x = scn.nextInt();

        ArrayList<Integer> res = firstAndLast(arr,n,x);
        Iterator<Integer> itr = res.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        scn.close();
    }
}