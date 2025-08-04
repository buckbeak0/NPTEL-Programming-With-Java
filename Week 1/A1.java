/*
 * Write a Java program to check if a given integer is “Positive” or “Negative”.
 * (0 (Zero) should be considered positive by this program.)
 */
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
                // Check if the number is Positive or Negative and print accordingly
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        in.close();
    }
}