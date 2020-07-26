import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int c, n;

        System.out.print("input (int) = ");
        n = userInput.nextInt();

        c = 0;
        if (n == 0) {
            System.out.println(n + " mod " + 1 + " = " + (0 % 1));
            c++;
            System.out.print("\n");
            System.out.println("c = " + c);
            System.out.println(n + " is not prime");
        } else if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(n +" mod " + i + " = " + (n % i));
                if (n % i == 0) {
                    c++;
                }
            }
            System.out.print("\n");
            System.out.println("c = " + c);
            System.out.println("c starts from 0. when mod result is 0, c++");
            if (c == 2) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        } else {
            System.out.println("your input is negative, there are no negative prime numbers");
        }
    }

}