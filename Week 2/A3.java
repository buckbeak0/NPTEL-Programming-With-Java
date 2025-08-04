/*
 * In an array of numbers, the maximum is the largest number among all elements.

In this assignment:

You will read n numbers from the user

Store them in an array

Find the largest number among them

Print the maximum number
*/

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];  // Assume first element is maximum
        // TODO: Use a loop to find maximum element

        /*
         Hint:
         Start loop from index 1 to n - 1
         Compare each element with max
         If element is greater, update max
         */
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }   
        System.out.println("Maximum is: " + max);

        sc.close();
    }
}