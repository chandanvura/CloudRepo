import java.util.Scanner;

public class Carry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for num1
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        // Taking input for num2
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        // Initialize carry to 0
        int carry = 0;
        // Initialize the count of carries to 0
        int numberOfCarries = 0;

        while (num1 > 0 || num2 > 0) {
            // Extract the last digits of num1 and num2
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            // Calculate the sum of digits and the carry for the next iteration
            int sum = digit1 + digit2 + carry;

            // If sum exceeds 9, there is a carry
            if (sum > 9) {
                numberOfCarries++; // Increment the count of carries
                carry = 1; // Update carry to 1
            } else {
                carry = 0; // Update carry to 0
            }

            // Remove the last digit from num1 and num2
            num1 /= 10;
            num2 /= 10;
        }

        // Output the result
        System.out.println("Number of carries: " + numberOfCarries);

        // Close the scanner
        scanner.close();
    }
}


/*
 * 
 * import java.util.Scanner;

public class Carry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0 || carry > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sumOfDigits = digit1 + digit2 + carry;

            carry = sumOfDigits / 10;
            count += carry;

            num1 /= 10;
            num2 /= 10;
        }

        System.out.println("Number of carries for " + num1 + " and " + num2 + ": " + count);
    }
}

 */