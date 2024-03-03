import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int xerox = num; 

        int rem = 0;
        int sum = 0;

        while (xerox != 0) {
            rem = xerox % 10;
            sum = sum + rem;
            xerox = xerox / 10; 
        }

        if (num % sum == 0) { 
            System.out.println("It's a Harshad number.");
        } else {
            System.out.println("It's not a Harshad number.");
        }
        sc.close();
    }
}
