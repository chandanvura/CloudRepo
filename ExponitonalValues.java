// write a programme to find the exponential value of the first digit to the power of last digit
import java.util.Scanner;

public class ExponitonalValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number ");
        int num = sc.nextInt();

        //take last digit here 
        int lastdigit = num % 10;

       //using temp value to get frirst digit 
        int temp = num;
        while (temp >9) {
            temp = temp / 10;

        }
        int firstDigit = temp;
        //find the value that is multiply first digit, lastv digit times.
        int exp = 1;
        for (int i = 1; i <= lastdigit; i++) {
            exp = exp * firstDigit;
        }
        System.out.println(exp);
        sc.close();
        
        }
        
        
    
}
