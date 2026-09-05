import java.util.Scanner;

public class Cpassfailarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int pass = 0;
        int fail = 0;
        for(int i=0; i<marks.length;i++){
            if(marks[i]>=40){
                pass++;
            }else{
                fail++;
            }
        }
        System.out.println("no of pass students are : " + pass);
        System.out.println("no of fail students are : " + fail);

    sc.close();
    } 
}
