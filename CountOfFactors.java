import java.util.Scanner;
public class CountOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number ");
        int number = sc.nextInt();
        int count =0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                count++;

            }

        }
        System.out.println(count);
        sc.close();
        
    }
    
}
