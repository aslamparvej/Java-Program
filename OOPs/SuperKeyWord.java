package OOPs;

class Parent {
    int a;
    void show(){
        System.out.println("This value from parent " + a);
    }
}
class Child extends Parent{
    int b;
    Child(int x, int y){
        // super keyword use to access data from parent class
        // super() keyword use to access method from parent class
        super.a = x;  
        super.show();
        System.out.println("This value from child " + y);
    }
}
class main{
    public static void main(String[] args) {
        Child c1 = new Child(10,20);
        c1.show();
    }
}