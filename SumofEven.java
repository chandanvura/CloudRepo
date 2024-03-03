import java.util.Scanner;

public class SumofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            int Last_digit = a % 10;
           
            if (Last_digit % 2 == 0) { // Check if the digit is even

                sum = sum + Last_digit;
            }
            //remove extrated digit from num
            a = a / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
