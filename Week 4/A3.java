import java.util.Scanner;

public class A3 {

    // Declare class Account with a private member variable
    static class Account {
        private int balance; // Private member, cannot be accessed directly from outside

        // Method to set balance value
        public void setBalance(int b) {
            balance = b;
        }
        // TODO: Write a public method to return balance value

        /*
         Hint:
         Declare a method getBalance() that returns the private variable 'balance'
         */
public int getBalance() {
  return balance;
}
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read balance value
        int b = sc.nextInt();

        // Create Account object
        Account acc = new Account();

        // Set balance using method
        acc.setBalance(b);

        // Print balance using the method
        System.out.println("Account Balance is: " + acc.getBalance());

        sc.close();
    }
}