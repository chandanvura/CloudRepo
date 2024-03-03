//wap to print sum of the factorial values of digits in the given number;
import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int xerox = num;
        while (xerox != 0) {

            int ld = xerox % 10;

            int fact = 1;
            for (int i = 1; i <= ld; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            xerox = xerox / 10;

        }
        System.out.println(sum);
            sc.close();

        }
        
    }
    

