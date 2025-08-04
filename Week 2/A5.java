/*
 * In this task, you will learn how to:

Declare multiple classes in the same Java program

Use constructors to initialize values

Apply the this keyword to refer to instance variables

What you need to do:

Declare a class called Circle with one member variable radius

Write a constructor for Circle that takes radius as a parameter and assigns it using the this keyword

In the main method, create an object of Circle and print its radius

This task helps understand how classes work together and how constructors and the this keyword are used for clarity.

 */
import java.util.Scanner;

public class A5 {

    // Declare a separate class named Circle
    static class Circle {

        int radius;

        // TODO: Write a constructor that takes radius as parameter
        // Use the 'this' keyword to assign the value to the member variable

        /*
         Hint:
         The constructor name should be Circle
         Use: this.radius = radius;
         */
        //Solution -------------
        public Circle(int r) {
            this.radius = r; 

        }
        //---------------------
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read radius value from user
        int r = sc.nextInt();

        // Create an object of Circle class using constructor
        Circle c = new Circle(r);

        // Print the radius using object member
        System.out.println("Radius of the circle is: " + c.radius);

        sc.close();
    }
}