package OOPs;

class A{
    int val;
    A(int x){
        this.val = x;
    }
    void showVal(){
        System.out.println(val);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        A a1 = new A(03);
        a1.showVal();

    }
}
