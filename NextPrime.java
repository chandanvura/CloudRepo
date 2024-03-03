import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // Increment n until a prime number is found
        while (true) {
            n++;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
                // If more than 2 divisors are found, it's not prime
                if (count > 2) {
                    break;
                }
            }
            // If exactly 2 divisors are found, it's prime
            if (count == 2) {
                System.out.println("The next prime number after " + (n - 1) + " is: " + n);
                break;
            }
        }
        sc.close();
    }
}
