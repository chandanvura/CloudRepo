import java.util.Scanner;
public class Strongnumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xerox = num;
        int sum = 0;

        while (xerox != 0) {
            int ld = xerox % 10;
            int prod = 1;
            for (int i = 1; i <= ld; i++) {
                prod = prod * i;

            }

            sum = sum + prod;
            xerox = xerox / 10;
        }
        if (sum == num) {
            System.out.println("strong number ");
        }
        else {
            System.out.println("not a strong number ");
        }
        sc.close();
    }
    
}
