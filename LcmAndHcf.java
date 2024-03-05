import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        // Calculate LCM
        int lcm = (num1 * num2) / gcd;

        // Output results
        System.out.println(gcd);
        System.out.println(lcm);

        scanner.close();
    }
}
