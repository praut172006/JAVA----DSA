import java.util.*;

public class Factorial{
    
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        }else if(n<0){
            return -1;
        }
      return n * factorial(n - 1);  // Recursive call
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();

      
        if(n == 0 || n == 1) {
            System.out.println("1");
        }else if(n<0){
            System.out.println("-1");
        }else{
          long fact=1;
            for(int i=1;i<=n;i++){
              fact=fact*i;
            }
            System.out.println(fact);
        }
      
      
        System.out.println("Factorial of " + n + " = " + factorial(n));
        
    sc.close();
    }
}
