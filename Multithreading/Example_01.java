/*
Create Thread by extending th thread class
*/
package Multithreading;

class A1 extends Thread{
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("From A class:" +i);
        }
        System.out.println("-------After A class:--------");
    }
}
class B1 extends Thread {
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("From B class:" +i);
        }
        System.out.println("------After B class:------");
    }
}
class Example_01{
    public static void main(String[] args) {
        A1 objA = new A1();
        B1 objB = new B1();

        objA.start();
        objB.start();
    }
}