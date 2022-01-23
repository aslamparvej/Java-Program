package Basic.Arrays;

class BasicOfArray{
    public static void main(String[] args) {

        // Array declaration 
        int[] arr1; 

        // Another way to declare a array
        // int arr2[]; 

        // Array Definition with size 5
        arr1 = new int[5];

        // Array Definition with size 10
        // arr2 = new int[10];

        // Array initialize 
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        // Array declaration and Definition in one line
        // int arr3[] = new int[5];

        // Array declaration,Definition and initialize in one line
        int arr4[] = {1,2,3,4,5,6,7,8,9,10};

        // Access Array element using forEach loop
        for (int i : arr4) {
            System.out.println(i);
        }
 
    }
}