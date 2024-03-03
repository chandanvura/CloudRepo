import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //count digits in a number but take temp value
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // temp will become zero so restore temp;
        temp = num;

        //declare and intilizate the sum varibale
        int sum = 0;

        //start the loop
        while (temp != 0) {
            //take last digit
            int ld = temp % 10;

            //find the exponential of last digit that is multiply last digit count times;

            int exp = 1;
            for (int i = 1; i <= count; i++) {

                exp = exp * ld;

            }

            //add exponential to sum 

            sum = sum + exp;

            //remove last digit

            temp = temp / 10;

        }
        
        //check sum and number are equal or not 

        if (sum == num) {
            System.out.println("Amstrorng number ");
        }
        else {
            System.out.println("not a amstrong number ");
        }
        sc.close();
        
    }
    
}
