import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter numbers :");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("initial array:"+ Arrays.toString(numbers));

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;

            index++;
            }
        }

        System.out.println("afterwads array"+ Arrays.toString(numbers));
    sc.close();
    }
}
