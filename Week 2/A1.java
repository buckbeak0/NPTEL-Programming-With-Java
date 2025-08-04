/*
 * Write a Java program to calculate the area of a rectangle.

The formula for area is:
Area = length × width


 */

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();
// ================================================
        // NOTE TO STUDENTS:
        // This is a simple beginner-level task.
        // Your role is to calculate the area using the given length and width.
        // Complete the line below using the correct formula.
        // ================================================

        // TODO: Calculate area of the rectangle

        /*
         Hint:
         - Multiply length and width to get the area
         - Store the result in a variable called 'area'
         */

//Solution--
         int area = length * width;

// Print the area
        System.out.print("Area is: " + area);

        sc.close();
    }
}