import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        final int MAX_MARKS = 100;
        final String[] subjectNames = {
            "Maths",
            "Science",
            "English",
            "History",
            "Computer Science"
        };

        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int subjects = subjectNames.length;
        double[] marks = new double[subjects];

        // Input marks for each subject
        for (int i = 0; i < subjects; i++) {
            while (true) {
                System.out.print("Enter marks for " + subjectNames[i] + " (0-100): ");
                double mark = scanner.nextDouble();

                if (mark >= 0 && mark <= MAX_MARKS) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                }
            }
        }

        // Calculate total marks
        double totalMarks = 0;

        for (double mark : marks) {
            totalMarks += mark;
        }

        // Calculate maximum possible marks
        int maximumTotal = subjects * MAX_MARKS;

        // Calculate percentage
        double percentage =
                (double) totalMarks / (double) maximumTotal * 100;

        // Calculate grade
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display result
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Student Name: " + name);

        for (int i = 0; i < subjects; i++) {
            System.out.println(subjectNames[i] + ": " + marks[i]);
        }

        System.out.println("Maximum Marks: " + maximumTotal);
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f %%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
