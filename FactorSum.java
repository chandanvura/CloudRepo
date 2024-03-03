import java.util.Scanner;

public class FactorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre  anumber");
        int number = sc.nextInt();
        int sum =0;
        

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum = sum + i;

                System.out.println(sum);

            }
        }
        sc.close();
        

    }

    
}
