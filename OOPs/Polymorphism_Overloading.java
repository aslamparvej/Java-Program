package OOPs;

// Here function name is same but number of argument are different 
public class Polymorphism_Overloading {
    
    static void calc(int x){
        System.out.println(x*x);
    }
    static void calc(int x,int y){
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        calc(5);
        calc(5,10);
    }
}
