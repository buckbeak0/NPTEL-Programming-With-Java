import java.util.Scanner;
class Student {
    private String name;
    private int age;
    // ================================
    // TODO: Implement the Student class with private fields (name, age),
    //       a constructor, and getter/setter methods.
    Student (String name, int age) {
    this.name = name;
    this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;    
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter student name: ");
        String name = scanner.next();

        // System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);

        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());

        scanner.close();
    }
}