import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int xerox = a;
        int rev = 0;
        while (xerox != 0) {
            int id = xerox % 10; // Using xerox instead of a
            rev = rev * 10 + id;
            xerox = xerox / 10;
        }
        if (rev == a) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
