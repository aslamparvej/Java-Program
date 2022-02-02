/*
Creating Thread by implementing Runnable class
*/
package Multithreading;

class Test implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("From  class Test: "+i);
        }
        System.out.println("------After run Method-------");
    }
}
public class Example_02 {
    public static void main(String[] args) {
        Test t = new Test();
        Thread objT = new Thread(t);
        objT.start();
        for (int index = 1; index <=5; index++) {
            System.out.println("From  main method: "+index);
        }
    }
}
