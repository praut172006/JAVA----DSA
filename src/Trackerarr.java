import java.util.*;

public class Trackerarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] novalue = {20,45,32,56,54,76,35};


        int min = novalue[0];
        for (int i = 1; i < novalue.length; i++) {
            min = Math.min(min, novalue[i]);
        }
        System.out.println("minimum value of the rainfall is : " + min);

        sc.close();
    }
}
