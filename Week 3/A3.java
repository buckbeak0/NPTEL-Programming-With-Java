import java.util.Scanner;
public class A3{
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();

        //Use while loop to count number of digits in an integer
        int sum = 0;
        while (num != 0) {
        sum += 1;
        num /= 10;
        }
        System.out.print(sum);

    }
}