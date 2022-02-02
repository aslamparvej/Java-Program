package Exception_Handling;

public class Example_01 {
    public static void main(String[] args) {
        try {
            int data = 100/0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
