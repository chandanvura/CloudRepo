import java.util.Scanner;
public class Happynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num = 49;
        //num should be greater than 9 because we should stop when the umber becomes single digit 
        
        
        while (num > 9) {

            // find sum of sqayres of digits of the number 
            int sum = 0;
            while (num != 0) {
                int ld = num % 10;
                sum = sum + ld * ld;
                num = num / 10;

            }
            // set num to sum becuase sum will becomes the new number to find the sum oof squrs of the digit ;
            num = sum;

        }
        if (num == 1) {
            System.out.println("Happy Number ");
        }
        else {
            System.out.println("Not an a Happy Number ");
        }
        sc.close();
        
    }
    
}
