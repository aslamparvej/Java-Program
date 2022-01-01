package OOPs;

// Here Parent class and child class has same method, so here occurs Method Overriding
// child class override the method display 

class Parent1{

    void display(){
        System.out.println("Hey, How is your programming journey?");
    }
}
class Child1{
    void display(){
        System.out.println("Hey, How is your life without programming?");
    }
}

public class Polymorphism_Overriding {
    public static void main(String[] args) {

        Parent1 p1 =  new Parent1();
        p1.display();

        Child1 c1 =  new Child1();
        c1.display();
    }
}
