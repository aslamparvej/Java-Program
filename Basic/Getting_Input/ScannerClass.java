package Basic.Getting_Input;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name:");
        String name = scan.nextLine();

        System.out.println("What's your age:");
        int age = scan.nextInt();
        
        System.out.println("Sex:");
        String sex = scan.next();

        System.out.println("Are you Indian");
        boolean q = scan.nextBoolean();

        System.out.println("Your name is "+name+" your are "+age+" years old"+" sex is " +sex);
        System.out.println("are you Indian: "+q);

        scan.close();
    }
}
