import java.util.*;
import java.util.Scanner;

public class Buildfloorpat {

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
    }

    public static void printLine(int n) {
        for (int j = 1; j <= n; j++) {
          System.out.print("* ");
          }
          System.out.println();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX_HEIGHT=20;
        System.out.println("Enter a number for height of building");
        int max = sc.nextInt();
        if(max<1||max>20){
          System.out.println("invalid height");
        }else{
          printTriangle(max);
        }
    }
}
