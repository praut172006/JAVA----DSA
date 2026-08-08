import java.util.*;
public class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number A");
        int A = sc.nextInt();

        System.out.println("Enter a number B");
        int B = sc.nextInt();

        // with using temp
        int temp =A;
        A =B;
        B =temp;

        System.out.println("number a is "+A);
        System.out.println("number a is "+B);

        // with out using temp
        A= A+B;
        B=A-B;
        A=A-B;

        System.out.println("number a is "+A);
        System.out.println("number a is "+B);

        // swap using multiplication and div
        A=A*B;
        B=A/B;
        A=A/B;

        System.out.println("number a is "+A);
        System.out.println("number a is "+B);
    }
}