package Multithreading;

class A3{
    int count = 0;
    synchronized void increament(){
        count++;
    }
}
public class Example_04 {
    public static void main(String[] args)  throws Exception{
        A3 obj = new A3();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    obj.increament();
                }
            }
            
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    obj.increament();
                }
            }
            
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count value is:" + obj.count);
    }
}
