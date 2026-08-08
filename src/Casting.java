public class Casting{
    public static void main(String[] args) {

        // Implicit Type Casting
        int a = 10;
        double b = a;   // int → double automatically

        System.out.println("Implicit Casting:");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);

        // Explicit Type Casting
        double x = 10.5;
        int y = (int) x;   // double → int manually

        System.out.println("\nExplicit Casting:");
        System.out.println("Double: " + x);
        System.out.println("Integer: " + y);

        int p = 5;
        int q = 2;

        double result = (double) p / q;

        System.out.println("Result = " + result);
    }
}