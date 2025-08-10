import java.util.*;
public class A1{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
        // Add the necessary code in the below space
        for (int i = n; i > 1; i--) {
        for (int j = i; j > 0; j--)
            System.out.print("*");
        System.out.println();

        }
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) 
            System.out.print("*");
        System.out.println();
        }
    }
}