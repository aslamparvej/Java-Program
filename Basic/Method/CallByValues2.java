package Basic.Method;
// Here I will pass a object reference as a value, so this is call by value not call by referece

class Operation{
    int a = 20;
    void changeValue(Operation obj){
        obj.a = obj.a + 100;
    }
}
public class CallByValues2 {
    public static void main(String[] args) {
        Operation obj = new Operation();
        System.out.println("Before Call the method value of a is: "+ obj.a);
        obj.changeValue(obj);
        System.out.println("After Call the method value of a is: "+ obj.a);
    }
}
// Here you can see value of calling method and called changed, because here i pass object reference as value 