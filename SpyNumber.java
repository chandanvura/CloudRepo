import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int product = 1;
        int sum = 0;
        while (number != 0) {

            int last_digit = number % 10;
            product = product * last_digit;
            sum = sum + last_digit;
            number = number / 10;

        }

        System.out.println(sum);
        System.out.println(product);
        if (sum == product) {
            System.out.println("Its a Spy Number  ");
        }
        else {
            System.out.println("its not a spy number ");
        }
        sc.close();
    

    
}


}
