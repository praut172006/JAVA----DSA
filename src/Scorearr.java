import java.util.*;

public class Scorearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of score :");
        int n = sc.nextInt();

        int[] noscore = new int[n];

        for(int i=0;i<noscore.length;i++){
            System.out.println("Enter a score " +(i+1)+" of player:");
            noscore[i]=sc.nextInt();
        }

        int max = noscore[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, noscore[i]);
        }
        System.out.println("higest score of the player is : " + max);

        sc.close();
    }
}
