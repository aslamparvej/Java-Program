package Multithreading;

class A2 extends Thread{
    public void run(){
        for (int i=1; i<=5; i++) {
            System.out.println("From class A:"+ isAlive());
        }
    }
}
public class Example_03{
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.start();
        System.out.println(obj.isAlive());
    }
}