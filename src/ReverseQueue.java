import java.util.*;

public class ReverseQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items in queue:");
        int n = sc.nextInt();

        int[] queue = new int[n];

        System.out.println("Enter elements of in queue:");
        for (int i = 0; i < n; i++) {
            queue[i] = sc.nextInt();
        }

        int start = 0;
        int end = queue.length - 1;

        while (start < end) {
            int temp = queue[start];
            queue[start] = queue[end];
            queue[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Queue: " + Arrays.toString(queue));

    sc.close();
    }
}
