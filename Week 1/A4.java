/*
 * Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.
 */

import java.util.Scanner;
public class A4{
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();

            //code for quotient and remainder
            System.out.println("The Quotient is = "+ (x/y));
            System.out.println("The Remainder is = "+ (x%y));
            sc.close();  
    }
}
