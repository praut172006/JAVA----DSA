public class Array{
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("Marks:");

        for (int i=0;i<marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Total subjects: " + marks.length);
    }
} 
