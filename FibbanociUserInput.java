import java.util.Scanner;

public class FibbanociUserInput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);

        for (int i = 2; i < number; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
        sc.close();
    }
}