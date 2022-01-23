package Questions;

// Here Only Orginal main mrthod are called by JVM.

class MainMethodOverload{
    public static void main(int args)
    {
        System.out.println("main() overloaded"
                           + " method 1 Executing");
    }
  
    public static void main(char args)
    {
        System.out.println("main() overloaded"
                           + " method 2 Executing");
    }
  
    public static void main(Double[] args)
    {
        System.out.println("main() overloaded"
                           + " method 3 Executing");
    }
  
    // Original main()
    public static void main(String[] args)
    {
        System.out.println("Original main()"
                           + " Executing");
    }
}