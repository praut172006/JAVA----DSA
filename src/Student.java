class Student {

    // Instance variable
    String name;
    int age;

    // Static variable
    static String college = "PCCOER";

    void display() {

        // Local variable
        int marks = 85;

        System.out.println("Name: " + name); //instance
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks); //local
        System.out.println("College: " + Student.college); //static
    }

    public static void main(String[] args) {

        // Object 1
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;

        // Object 2
        Student s2 = new Student();
        s2.name = "Amit";
        s2.age = 21;

        s1.display();
        s2.display();
    }
}