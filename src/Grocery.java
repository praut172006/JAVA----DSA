import java.util.*;

public class Grocery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        int[] items = new int[n];

        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }

        int sum = 0;

        System.out.println("Enter value for each item");
        for (int i = 0; i < n; i++) {
            sum = sum + items[i];
        }

        System.out.println("Total = " + sum);

        sc.close();
    }
}
