import java.util.Scanner;

public class A1 {

    // Declare a class Student with one member variable of default access
    static class Student {
        int rollNo; // Default access modifier (no keyword written)

        // Constructor to assign rollNo
        Student(int r) {
            rollNo = r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read roll number
        int r = sc.nextInt();

        // Create Student object with roll number
        Student s = new Student(r);
        // TODO: Print the roll number using the object

        /*
         Hint:
         Access the member using: s.rollNo
         */
		System.out.println("Roll Number is: "+s.rollNo);
        sc.close();
    }
}