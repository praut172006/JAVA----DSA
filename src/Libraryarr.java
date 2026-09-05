import java.util.*;

public class Libraryarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books:");
        int n = sc.nextInt();

        int[] books_id = new int[n];

        System.out.println("Enter books id :");
        for (int i = 0; i < n; i++) {
            books_id[i] = sc.nextInt();
        }

        System.out.println("Enter target books id :");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < books_id.length; i++) {

            if (books_id[i] == target) {
                System.out.println("Target found");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    sc.close();
    }
}
