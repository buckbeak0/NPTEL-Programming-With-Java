/*
 *Write a Java program to calculate the volume of a cylinder given its radius and height.
 Formula:
 V=π∗r2∗h 
 */
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

        // Calculate the volume
        double volume = (Math.PI * radius * radius * height);
        // Display the result
        
        System.out.printf("Volume is: %.2f", volume);
        in.close();
    }
}