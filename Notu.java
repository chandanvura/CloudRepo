import java.util.Scanner;

public class Notu{

    public static int specialSum(int a, int b) {
        // Calculate the sum of a and b
        int result = a + b;

        // Check if the sum is in the forbidden range (10 to 19 inclusive)
        if (result >= 10 && result <= 19) {
            return 20; // Return 20 if the sum is in the forbidden range
        } else {
            return result; // Return the actual sum otherwise
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Call the specialSum method with user input
        int result = specialSum(a, b);

        // Display the result
        System.out.println("The special sum is: " + result);

        // Close the Scanner
        scanner.close();
    }
}
