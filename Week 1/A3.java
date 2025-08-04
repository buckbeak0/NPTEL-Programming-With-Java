/*
 * Write a Java program to print the multiplication table of a given number up to 4.
 */
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(); 

        // Print the multiplication table of number up to 4
        for (int i = 1; i <= 4; i++) {
	        System.out.println(number + " x "+ i +" = " + (number * i));
        }


        in.close();
    }
}


