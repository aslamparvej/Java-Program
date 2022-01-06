package Basic.Method;

public class CallByValues1 {

    public static void changeValue(int a){
        a = a*a;
    }
    public static void main(String[] args) {
        int a = 20;
        System.out.println("Before call the method value of a is :"+ a);
        changeValue(a); // call the method by passing value of variable a.
        System.out.println("After call the method value of a is :"+ a);
    }
}
// You can see, here the value of a not changed by the called method,
// Java does npot support call by reference