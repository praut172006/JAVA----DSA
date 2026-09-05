import java.util.*;
public class Stdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of student :");
        int n = sc.nextInt();

        int[] nostd = new int[n];

        for(int i=0;i<nostd.length;i++){
            System.out.println("Enter a marks of student:"+ (1+i));
            nostd[i]=sc.nextInt();
        }

        double avg=0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nostd[i];
        }
        avg = sum / nostd.length;

        System.out.println("avg marks of class is :"+ avg);
        sc.close();


    }
}
