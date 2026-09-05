import java.util.Arrays;
import java.util.Scanner;
public class Productmultiplier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of products:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++){
            nums[i]=i+1;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }

        System.out.println("Product Array: " + Arrays.toString(result));

        sc.close();
    }
}
