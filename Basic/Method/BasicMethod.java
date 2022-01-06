package Basic.Method;

class BasicMethod{

    static int sum (int a, int b){
        return a+b;
    }
    // Here void is return type of the method and printSum is name of the method,
    // int sum is argument of the method.
    static void printSum(int sum){
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        int a = 20, b = 30;
        int sumValue = sum(a,b); // call the method sum
        printSum(sumValue); // call the method printSum

    }
}